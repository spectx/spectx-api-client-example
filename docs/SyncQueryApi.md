# SyncQueryApi

All URIs are relative to *https://127.0.0.1:8388/API/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeSync**](SyncQueryApi.md#executeSync) | **POST** / | Execute query and return resultset
[**fetchScript**](SyncQueryApi.md#fetchScript) | **GET** /scripts/{path} | Execute query and return resultset


<a name="executeSync"></a>
# **executeSync**
> executeSync(scriptPath, optTimezone, optTimestampFormat, optTimestampNanoFormat, optOmitHeader, accept, range, scriptBody)

Execute query and return resultset

Execute query and return resultset. Script can be specified in scriptPath or overriden in request body. Input parameters to script can be specified as query parameters. Resultset format can be specified via Accept header. Partial resultset can be requested via Range header.

### Example
```java
// Import classes:
//import com.spectx.apiClientExample.ApiClient;
//import com.spectx.apiClientExample.ApiException;
//import com.spectx.apiClientExample.Configuration;
//import com.spectx.apiClientExample.auth.*;
//import com.spectx.apiClientExample.api.SyncQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SyncQueryApi apiInstance = new SyncQueryApi();
String scriptPath = "scriptPath_example"; // String | Path to the script to execute or directory to use as working directory
String optTimezone = "optTimezone_example"; // String | Name of the timezone to use for the query, in IANA Time Zone Database format
String optTimestampFormat = "optTimestampFormat_example"; // String | Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format
String optTimestampNanoFormat = "optTimestampNanoFormat_example"; // String | Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format
Boolean optOmitHeader = true; // Boolean | When true, resultset header row is not produced
String accept = "accept_example"; // String | Mime type for Resultset format
String range = "range_example"; // String | Ranges of resultset items to return, in RFC 7233 format, using unit \"items\" (items=first-last,...)
String scriptBody = "scriptBody_example"; // String | The body of the script to execute. Specify to override content of script given by scriptPath
try {
    apiInstance.executeSync(scriptPath, optTimezone, optTimestampFormat, optTimestampNanoFormat, optOmitHeader, accept, range, scriptBody);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncQueryApi#executeSync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptPath** | **String**| Path to the script to execute or directory to use as working directory |
 **optTimezone** | **String**| Name of the timezone to use for the query, in IANA Time Zone Database format | [optional]
 **optTimestampFormat** | **String**| Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format | [optional]
 **optTimestampNanoFormat** | **String**| Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format | [optional]
 **optOmitHeader** | **Boolean**| When true, resultset header row is not produced | [optional]
 **accept** | **String**| Mime type for Resultset format | [optional]
 **range** | **String**| Ranges of resultset items to return, in RFC 7233 format, using unit \&quot;items\&quot; (items&#x3D;first-last,...) | [optional]
 **scriptBody** | **String**| The body of the script to execute. Specify to override content of script given by scriptPath | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json, application/json-seq, application/x-ndjson, application/csv, application/tsv

<a name="fetchScript"></a>
# **fetchScript**
> fetchScript(path, token, acceptContentType, optTimezone, optTimestampFormat, optTimestampNanoFormat, optOmitHeader, range)

Execute query and return resultset

Execute query and return resultset. This operation is tailored for clients that do not support setting request headers. Api key should be specified as \&quot;token\&quot; query parameter. Script should be specified in path. Input parameters to script can be specified as query parameters. Resultset format can be specified via \&quot;acceptContentType\&quot; query parameter. Partial resultset can be requested via Range header.

### Example
```java
// Import classes:
//import com.spectx.apiClientExample.ApiClient;
//import com.spectx.apiClientExample.ApiException;
//import com.spectx.apiClientExample.Configuration;
//import com.spectx.apiClientExample.auth.*;
//import com.spectx.apiClientExample.api.SyncQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SyncQueryApi apiInstance = new SyncQueryApi();
String path = "path_example"; // String | Path to the script to execute
String token = "token_example"; // String | API key for authentication
String acceptContentType = "acceptContentType_example"; // String | Mime type for Resultset format
String optTimezone = "optTimezone_example"; // String | Name of the timezone to use for the query, in IANA Time Zone Database format
String optTimestampFormat = "optTimestampFormat_example"; // String | Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format
String optTimestampNanoFormat = "optTimestampNanoFormat_example"; // String | Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format
Boolean optOmitHeader = true; // Boolean | When true, resultset header row is not produced
String range = "range_example"; // String | Ranges of resultset items to return, in RFC 7233 format, using unit \"items\" (items=first-last,...)
try {
    apiInstance.fetchScript(path, token, acceptContentType, optTimezone, optTimestampFormat, optTimestampNanoFormat, optOmitHeader, range);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncQueryApi#fetchScript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to the script to execute |
 **token** | **String**| API key for authentication |
 **acceptContentType** | **String**| Mime type for Resultset format | [optional]
 **optTimezone** | **String**| Name of the timezone to use for the query, in IANA Time Zone Database format | [optional]
 **optTimestampFormat** | **String**| Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format | [optional]
 **optTimestampNanoFormat** | **String**| Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format | [optional]
 **optOmitHeader** | **Boolean**| When true, resultset header row is not produced | [optional]
 **range** | **String**| Ranges of resultset items to return, in RFC 7233 format, using unit \&quot;items\&quot; (items&#x3D;first-last,...) | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json-seq, application/x-ndjson, application/csv, application/tsv

