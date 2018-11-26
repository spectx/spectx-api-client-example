# TableApi

All URIs are relative to *https://127.0.0.1:8388/API/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchTable**](TableApi.md#fetchTable) | **GET** /tables/{path} | Fetch contents of table


<a name="fetchTable"></a>
# **fetchTable**
> fetchTable(path, optTimezone, optTimestampFormat, optTimestampNanoFormat, optOmitHeader, accept, acceptContentType, range)

Fetch contents of table

Fetch contents of table specified by path. Resultset format can be specified via Accept header or \&quot;acceptContentType\&quot; query parameter (latter takes precedence). Partial resultset can be requested via Range header.

### Example
```java
// Import classes:
//import com.spectx.apiClientExample.ApiClient;
//import com.spectx.apiClientExample.ApiException;
//import com.spectx.apiClientExample.Configuration;
//import com.spectx.apiClientExample.auth.*;
//import com.spectx.apiClientExample.api.TableApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TableApi apiInstance = new TableApi();
String path = "path_example"; // String | Path to the table to fetch
String optTimezone = "optTimezone_example"; // String | Name of the timezone to use for the query, in IANA Time Zone Database format
String optTimestampFormat = "optTimestampFormat_example"; // String | Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format
String optTimestampNanoFormat = "optTimestampNanoFormat_example"; // String | Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format
Boolean optOmitHeader = true; // Boolean | When true, resultset header row is not produced
String accept = "accept_example"; // String | Mime type for Resultset format
String acceptContentType = "acceptContentType_example"; // String | Mime type for Resultset format
String range = "range_example"; // String | Ranges of resultset items to return, in RFC 7233 format, using unit \"items\" (items=first-last,...)
try {
    apiInstance.fetchTable(path, optTimezone, optTimestampFormat, optTimestampNanoFormat, optOmitHeader, accept, acceptContentType, range);
} catch (ApiException e) {
    System.err.println("Exception when calling TableApi#fetchTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to the table to fetch |
 **optTimezone** | **String**| Name of the timezone to use for the query, in IANA Time Zone Database format | [optional]
 **optTimestampFormat** | **String**| Format to use for presenting timestamp values in response, specified in Java DateTimeFormatter format | [optional]
 **optTimestampNanoFormat** | **String**| Format to use for presenting timestampNano values in response, specified in Java DateTimeFormatter format | [optional]
 **optOmitHeader** | **Boolean**| When true, resultset header row is not produced | [optional]
 **accept** | **String**| Mime type for Resultset format | [optional]
 **acceptContentType** | **String**| Mime type for Resultset format | [optional]
 **range** | **String**| Ranges of resultset items to return, in RFC 7233 format, using unit \&quot;items\&quot; (items&#x3D;first-last,...) | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json-seq, application/x-ndjson, application/csv, application/tsv

