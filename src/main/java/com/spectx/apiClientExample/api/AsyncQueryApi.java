package com.spectx.apiClientExample.api;

import com.spectx.apiClientExample.ApiException;
import com.spectx.apiClientExample.ApiClient;
import com.spectx.apiClientExample.Configuration;
import com.spectx.apiClientExample.Pair;

import javax.ws.rs.core.GenericType;

import com.spectx.apiClientExample.model.Error;
import com.spectx.apiClientExample.model.ExecuteAsyncResponse;
import com.spectx.apiClientExample.model.QueryStatus;

import java.util.Map;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-23T21:09:27.694+02:00")
public class AsyncQueryApi {
  private ApiClient apiClient;

  public AsyncQueryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AsyncQueryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancel query
   * Cancel an in progress query or free the resultset of a finished query
   * @param id Query identifier (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelQuery(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelQuery");
    }
    
    // create path and map variables
    String localVarPath = "/queries/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Begin executing query and return query id
   * Begin executing query and return query id. Script can be specified in scriptPath or overriden in request body. Input parameters to script can be specified as query parameters.
   * @param scriptPath Path to the script to execute or directory to use as working directory (required)
   * @param optTimezone Name of the timezone to use for the query, in IANA Time Zone Database format (optional)
   * @param scriptBody The body of the script to execute. Specify to override content of script given by scriptPath (optional)
   * @return ExecuteAsyncResponse
   * @throws ApiException if fails to make API call
   */
  public ExecuteAsyncResponse executeAsync(String scriptPath, String optTimezone, String scriptBody, Map<String, String> params) throws ApiException {
    Object localVarPostBody = scriptBody;
    
    // verify the required parameter 'scriptPath' is set
    if (scriptPath == null) {
      throw new ApiException(400, "Missing the required parameter 'scriptPath' when calling executeAsync");
    }
    
    // create path and map variables
    String localVarPath = "/queries";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scriptPath", scriptPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timezone", optTimezone));
    if (params != null) {
      for (Map.Entry<String, String> param : params.entrySet()) {
        localVarQueryParams.add(new Pair(param.getKey(), param.getValue()));
      }
    }

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "text/plain"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ExecuteAsyncResponse> localVarReturnType = new GenericType<ExecuteAsyncResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch the resultset of a finished query
   * Fetch the resultset of a finished query. Resultset format can be specified via Accept header. Partial resultset can be requested via Range header.
   * @param id Query identifier (required)
   * @param optTimezone Name of the timezone to use for the query, in IANA Time Zone Database format (optional)
   * @param optTimestampFormat Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format (optional)
   * @param optTimestampNanoFormat Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format (optional)
   * @param optOmitHeader When true, resultset header row is not produced (optional)
   * @param accept Mime type for Resultset format (optional)
   * @param range Ranges of resultset items to return, in RFC 7233 format, using unit \&quot;items\&quot; (items&#x3D;first-last,...) (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object fetchResult(java.util.UUID id, String optTimezone, String optTimestampFormat, String optTimestampNanoFormat, Boolean optOmitHeader, String accept, String range) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling fetchResult");
    }
    
    // create path and map variables
    String localVarPath = "/queries/{id}/result"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timezone", optTimezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timestampFormat", optTimestampFormat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timestampNanoFormat", optTimestampNanoFormat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.omitHeader", optOmitHeader));

    if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));
if (range != null)
      localVarHeaderParams.put("Range", apiClient.parameterToString(range));

    
    final String[] localVarAccepts = {
      "application/json", "application/json-seq", "application/x-ndjson", "application/csv", "application/tsv"
    };
    final String localVarAccept = accept == null ? apiClient.selectHeaderAccept(localVarAccepts) : null;

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve status of query
   * 
   * @param id Query identifier (required)
   * @return QueryStatus
   * @throws ApiException if fails to make API call
   */
  public QueryStatus queryStatus(java.util.UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling queryStatus");
    }
    
    // create path and map variables
    String localVarPath = "/queries/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<QueryStatus> localVarReturnType = new GenericType<QueryStatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
