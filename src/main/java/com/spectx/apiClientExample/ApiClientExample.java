package com.spectx.apiClientExample;

import com.spectx.apiClientExample.api.AsyncQueryApi;
import com.spectx.apiClientExample.model.*;
import jersey.repackaged.com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.UUID;


/**
 * Copyright (C) 2018 SpectX
 * Created by Lauri Nõmme
 * 23.11.2018 17:55
 */
public class ApiClientExample {
    private static final HashSet<State> TERMINAL_STATES = Sets.newHashSet(State.SUCCEEDED, State.FAILED, State.CANCELLED);

    public static void main(String[] args) throws InterruptedException {
        AsyncQueryApi asyncQueryApi = getAsyncQueryApi();
        try {
            UUID queryId = asyncQueryApi.executeAsync("/user/cpuheavy.sx", null, null).getQueryId();
            System.out.println("Submitted as queryId = " + queryId);

            QueryStatus status;
            long startTime = System.currentTimeMillis();
            do {
                if (System.currentTimeMillis() - startTime > 10_000) {
                    asyncQueryApi.cancelQuery(queryId);
                    System.out.println("Cancelled");
                    return;
                }
                status = asyncQueryApi.queryStatus(queryId);
                System.out.println("Status state = " + status.getState() + " progress = " + status.getProgress());
                Thread.sleep(500);
            } while (!TERMINAL_STATES.contains(status.getState()));

            Object result = asyncQueryApi.fetchResult(queryId, null, null, null, null, null, null);
            System.out.println("result = " + result);

        } catch (ApiException e) {
            System.err.println("Failure: " + e.getCode() + "/" + e.getMessage());
        }
    }

    private static AsyncQueryApi getAsyncQueryApi() {
        ApiClient client = new ApiClient();
        client.setBasePath("http://127.0.0.1:8388/API/v1.0");
        client.setApiKeyPrefix("Bearer");
        client.setApiKey("23ae55c5f5a5bde0");
        client.setDebugging(true);

        return new AsyncQueryApi(client);
    }
}
