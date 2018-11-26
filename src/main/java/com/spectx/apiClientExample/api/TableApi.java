package com.spectx.apiClientExample.api;

import com.spectx.apiClientExample.ApiException;
import com.spectx.apiClientExample.ApiClient;
import com.spectx.apiClientExample.Configuration;
import com.spectx.apiClientExample.Pair;

import javax.ws.rs.core.GenericType;

import com.spectx.apiClientExample.model.Error;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-23T21:09:27.694+02:00")
public class TableApi {
  private ApiClient apiClient;

  public TableApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TableApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Fetch contents of table
   * Fetch contents of table specified by path. Resultset format can be specified via Accept header or \&quot;acceptContentType\&quot; query parameter (latter takes precedence). Partial resultset can be requested via Range header.
   * @param path Path to the table to fetch (required)
   * @param optTimezone Name of the timezone to use for the query, in IANA Time Zone Database format (optional)
   * @param optTimestampFormat Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format (optional)
   * @param optTimestampNanoFormat Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format (optional)
   * @param optOmitHeader When true, resultset header row is not produced (optional)
   * @param accept Mime type for Resultset format (optional)
   * @param acceptContentType Mime type for Resultset format (optional)
   * @param range Ranges of resultset items to return, in RFC 7233 format, using unit \&quot;items\&quot; (items&#x3D;first-last,...) (optional)
   * @throws ApiException if fails to make API call
   */
  public void fetchTable(String path, String optTimezone, String optTimestampFormat, String optTimestampNanoFormat, Boolean optOmitHeader, String accept, String acceptContentType, String range) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling fetchTable");
    }
    
    // create path and map variables
    String localVarPath = "/tables/{path}"
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timezone", optTimezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timestampFormat", optTimestampFormat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.timestampNanoFormat", optTimestampNanoFormat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "opt.omitHeader", optOmitHeader));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "acceptContentType", acceptContentType));

    if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));
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
