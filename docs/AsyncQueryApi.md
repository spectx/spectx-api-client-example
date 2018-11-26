# AsyncQueryApi

All URIs are relative to *https://127.0.0.1:8388/API/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelQuery**](AsyncQueryApi.md#cancelQuery) | **DELETE** /queries/{id} | Cancel query
[**executeAsync**](AsyncQueryApi.md#executeAsync) | **POST** /queries | Begin executing query and return query id
[**fetchResult**](AsyncQueryApi.md#fetchResult) | **GET** /queries/{id}/result | Fetch the resultset of a finished query
[**queryStatus**](AsyncQueryApi.md#queryStatus) | **GET** /queries/{id} | Retrieve status of query


<a name="cancelQuery"></a>
# **cancelQuery**
> cancelQuery(id)

Cancel query

Cancel an in progress query or free the resultset of a finished query

### Example
```java
// Import classes:
//import com.spectx.apiClientExample.ApiClient;
//import com.spectx.apiClientExample.ApiException;
//import com.spectx.apiClientExample.Configuration;
//import com.spectx.apiClientExample.auth.*;
//import com.spectx.apiClientExample.api.AsyncQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AsyncQueryApi apiInstance = new AsyncQueryApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | Query identifier
try {
    apiInstance.cancelQuery(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncQueryApi#cancelQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| Query identifier |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="executeAsync"></a>
# **executeAsync**
> ExecuteAsyncResponse executeAsync(scriptPath, optTimezone, scriptBody)

Begin executing query and return query id

Begin executing query and return query id. Script can be specified in scriptPath or overriden in request body. Input parameters to script can be specified as query parameters.

### Example
```java
// Import classes:
//import com.spectx.apiClientExample.ApiClient;
//import com.spectx.apiClientExample.ApiException;
//import com.spectx.apiClientExample.Configuration;
//import com.spectx.apiClientExample.auth.*;
//import com.spectx.apiClientExample.api.AsyncQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AsyncQueryApi apiInstance = new AsyncQueryApi();
String scriptPath = "scriptPath_example"; // String | Path to the script to execute or directory to use as working directory
String optTimezone = "optTimezone_example"; // String | Name of the timezone to use for the query, in IANA Time Zone Database format
String scriptBody = "scriptBody_example"; // String | The body of the script to execute. Specify to override content of script given by scriptPath
try {
    ExecuteAsyncResponse result = apiInstance.executeAsync(scriptPath, optTimezone, scriptBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncQueryApi#executeAsync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptPath** | **String**| Path to the script to execute or directory to use as working directory |
 **optTimezone** | **String**| Name of the timezone to use for the query, in IANA Time Zone Database format | [optional]
 **scriptBody** | **String**| The body of the script to execute. Specify to override content of script given by scriptPath | [optional]

### Return type

[**ExecuteAsyncResponse**](ExecuteAsyncResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

<a name="fetchResult"></a>
# **fetchResult**
> Object fetchResult(id, optTimezone, optTimestampFormat, optTimestampNanoFormat, optOmitHeader, accept, range)

Fetch the resultset of a finished query

Fetch the resultset of a finished query. Resultset format can be specified via Accept header. Partial resultset can be requested via Range header.

### Example
```java
// Import classes:
//import com.spectx.apiClientExample.ApiClient;
//import com.spectx.apiClientExample.ApiException;
//import com.spectx.apiClientExample.Configuration;
//import com.spectx.apiClientExample.auth.*;
//import com.spectx.apiClientExample.api.AsyncQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AsyncQueryApi apiInstance = new AsyncQueryApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | Query identifier
String optTimezone = "optTimezone_example"; // String | Name of the timezone to use for the query, in IANA Time Zone Database format
String optTimestampFormat = "optTimestampFormat_example"; // String | Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format
String optTimestampNanoFormat = "optTimestampNanoFormat_example"; // String | Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format
Boolean optOmitHeader = true; // Boolean | When true, resultset header row is not produced
String accept = "accept_example"; // String | Mime type for Resultset format
String range = "range_example"; // String | Ranges of resultset items to return, in RFC 7233 format, using unit \"items\" (items=first-last,...)
try {
    Object result = apiInstance.fetchResult(id, optTimezone, optTimestampFormat, optTimestampNanoFormat, optOmitHeader, accept, range);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncQueryApi#fetchResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| Query identifier |
 **optTimezone** | **String**| Name of the timezone to use for the query, in IANA Time Zone Database format | [optional]
 **optTimestampFormat** | **String**| Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format | [optional]
 **optTimestampNanoFormat** | **String**| Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format | [optional]
 **optOmitHeader** | **Boolean**| When true, resultset header row is not produced | [optional]
 **accept** | **String**| Mime type for Resultset format | [optional]
 **range** | **String**| Ranges of resultset items to return, in RFC 7233 format, using unit \&quot;items\&quot; (items&#x3D;first-last,...) | [optional]

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json-seq, application/x-ndjson, application/csv, application/tsv

<a name="queryStatus"></a>
# **queryStatus**
> QueryStatus queryStatus(id)

Retrieve status of query

### Example
```java
// Import classes:
//import com.spectx.apiClientExample.ApiClient;
//import com.spectx.apiClientExample.ApiException;
//import com.spectx.apiClientExample.Configuration;
//import com.spectx.apiClientExample.auth.*;
//import com.spectx.apiClientExample.api.AsyncQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AsyncQueryApi apiInstance = new AsyncQueryApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | Query identifier
try {
    QueryStatus result = apiInstance.queryStatus(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncQueryApi#queryStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| Query identifier |

### Return type

[**QueryStatus**](QueryStatus.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

