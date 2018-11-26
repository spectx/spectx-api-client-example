# apiClientExample

The client library has been generated with:
```shell
java -DapiTests=false -jar ../swagger-codegen-cli-2.3.1.jar generate -i api.v1.yaml -l java -c config.json -o .
```

Example usage is demonstrated in com.spectx.apiClientExample.ApiClientExample class. 

## Requirementsas

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.spectx</groupId>
    <artifactId>apiClientExample</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.spectx:apiClientExample:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/apiClientExample-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.spectx.apiClientExample.*;
import com.spectx.apiClientExample.auth.*;
import com.spectx.apiClientExample.model.*;
import com.spectx.apiClientExample.api.AsyncQueryApi;

import java.io.File;
import java.util.*;

public class AsyncQueryApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://127.0.0.1:8388/API/v1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AsyncQueryApi* | [**cancelQuery**](docs/AsyncQueryApi.md#cancelQuery) | **DELETE** /queries/{id} | Cancel query
*AsyncQueryApi* | [**executeAsync**](docs/AsyncQueryApi.md#executeAsync) | **POST** /queries | Begin executing query and return query id
*AsyncQueryApi* | [**fetchResult**](docs/AsyncQueryApi.md#fetchResult) | **GET** /queries/{id}/result | Fetch the resultset of a finished query
*AsyncQueryApi* | [**queryStatus**](docs/AsyncQueryApi.md#queryStatus) | **GET** /queries/{id} | Retrieve status of query
*SyncQueryApi* | [**executeSync**](docs/SyncQueryApi.md#executeSync) | **POST** / | Execute query and return resultset
*SyncQueryApi* | [**fetchScript**](docs/SyncQueryApi.md#fetchScript) | **GET** /scripts/{path} | Execute query and return resultset
*TableApi* | [**fetchTable**](docs/TableApi.md#fetchTable) | **GET** /tables/{path} | Fetch contents of table


## Documentation for Models

 - [Error](docs/Error.md)
 - [ExecuteAsyncResponse](docs/ExecuteAsyncResponse.md)
 - [QueryStatus](docs/QueryStatus.md)
 - [State](docs/State.md)
 - [StateChange](docs/StateChange.md)
 - [Warning](docs/Warning.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@spectx.com

