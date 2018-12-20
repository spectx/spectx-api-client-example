package com.spectx.apiClientExample.api;

import com.spectx.apiClientExample.ApiException;
import com.spectx.apiClientExample.ApiClient;
import com.spectx.apiClientExample.Configuration;
import com.spectx.apiClientExample.Pair;

import javax.ws.rs.core.GenericType;

import com.spectx.apiClientExample.model.Error;

import java.util.Map;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-23T21:09:27.694+02:00")
public class SyncQueryApi {
  private ApiClient apiClient;

  public SyncQueryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SyncQueryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Execute query and return resultset
   * Execute query and return resultset. Script can be specified in scriptPath or overriden in request body. Input parameters to script can be specified as query parameters. Resultset format can be specified via Accept header. Partial resultset can be requested via Range header.
   * @param scriptPath Path to the script to execute or directory to use as working directory (required)
   * @param optTimezone Name of the timezone to use for the query, in IANA Time Zone Database format (optional)
   * @param optTimestampFormat Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format (optional)
   * @param optTimestampNanoFormat Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format (optional)
   * @param optOmitHeader When true, resultset header row is not produced (optional)
   * @param accept Mime type for Resultset format (optional)
   * @param range Ranges of resultset items to return, in RFC 7233 format, using unit \&quot;items\&quot; (items&#x3D;first-last,...) (optional)
   * @param scriptBody The body of the script to execute. Specify to override content of script given by scriptPath (optional)
   * @throws ApiException if fails to make API call
   */
  public void executeSync(String scriptPath, String optTimezone, String optTimestampFormat, String optTimestampNanoFormat, Boolean optOmitHeader, String accept, String range, String scriptBody, Map<String, String> params) throws ApiException {
    Object localVarPostBody = scriptBody;
    
    // verify the required parameter 'scriptPath' is set
    if (scriptPath == null) {
      throw new ApiException(400, "Missing the required parameter 'scriptPath' when calling executeSync");
    }
    
    // create path and map variables
    String localVarPath = "/";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scriptPath", scriptPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timezone", optTimezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timestampFormat", optTimestampFormat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timestampNanoFormat", optTimestampNanoFormat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.omitHeader", optOmitHeader));
    if (params != null) {
      for (Map.Entry<String, String> param : params.entrySet()) {
        localVarQueryParams.add(new Pair(param.getKey(), param.getValue()));
      }
    }

    if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));
if (range != null)
      localVarHeaderParams.put("Range", apiClient.parameterToString(range));

    
    final String[] localVarAccepts = {
      "application/json", "application/json-seq", "application/x-ndjson", "application/csv", "application/tsv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "text/plain"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Execute query and return resultset
   * Execute query and return resultset. This operation is tailored for clients that do not support setting request headers. Api key should be specified as \&quot;token\&quot; query parameter. Script should be specified in path. Input parameters to script can be specified as query parameters. Resultset format can be specified via \&quot;acceptContentType\&quot; query parameter. Partial resultset can be requested via Range header.
   * @param path Path to the script to execute (required)
   * @param token API key for authentication (required)
   * @param acceptContentType Mime type for Resultset format (optional)
   * @param optTimezone Name of the timezone to use for the query, in IANA Time Zone Database format (optional)
   * @param optTimestampFormat Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format (optional)
   * @param optTimestampNanoFormat Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format (optional)
   * @param optOmitHeader When true, resultset header row is not produced (optional)
   * @param range Ranges of resultset items to return, in RFC 7233 format, using unit \&quot;items\&quot; (items&#x3D;first-last,...) (optional)
   * @throws ApiException if fails to make API call
   */
  public void fetchScript(String path, String token, String acceptContentType, String optTimezone, String optTimestampFormat, String optTimestampNanoFormat, Boolean optOmitHeader, String range) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling fetchScript");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling fetchScript");
    }
    
    // create path and map variables
    String localVarPath = "/scripts/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "acceptContentType", acceptContentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timezone", optTimezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timestampFormat", optTimestampFormat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timestampNanoFormat", optTimestampNanoFormat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.omitHeader", optOmitHeader));

    if (range != null)
      localVarHeaderParams.put("Range", apiClient.parameterToString(range));

    
    final String[] localVarAccepts = {
      "application/json", "application/json-seq", "application/x-ndjson", "application/csv", "application/tsv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
