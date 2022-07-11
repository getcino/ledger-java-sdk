# MappingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMapping**](MappingApi.md#getMapping) | **GET** {ledger}/mapping | Get the mapping of a ledger. |
| [**updateMapping**](MappingApi.md#updateMapping) | **PUT** {ledger}/mapping | Update the mapping of a ledger. |



## getMapping

> MappingResponse getMapping(ledger)

Get the mapping of a ledger.

### Example

```java
// Import classes:
import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.ApiException;
import com.formance.ledgerclient.Configuration;
import com.formance.ledgerclient.auth.*;
import com.formance.ledgerclient.models.*;
import com.formance.ledgerclient.api.MappingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        MappingApi apiInstance = new MappingApi(defaultClient);
        String ledger = "ledger001"; // String | Name of the ledger.
        try {
            MappingResponse result = apiInstance.getMapping(ledger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MappingApi#getMapping");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ledger** | **String**| Name of the ledger. | |

### Return type

[**MappingResponse**](MappingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateMapping

> MappingResponse updateMapping(ledger, mapping)

Update the mapping of a ledger.

### Example

```java
// Import classes:
import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.ApiException;
import com.formance.ledgerclient.Configuration;
import com.formance.ledgerclient.auth.*;
import com.formance.ledgerclient.models.*;
import com.formance.ledgerclient.api.MappingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        MappingApi apiInstance = new MappingApi(defaultClient);
        String ledger = "ledger001"; // String | Name of the ledger.
        Mapping mapping = new Mapping(); // Mapping | 
        try {
            MappingResponse result = apiInstance.updateMapping(ledger, mapping);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MappingApi#updateMapping");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ledger** | **String**| Name of the ledger. | |
| **mapping** | [**Mapping**](Mapping.md)|  | |

### Return type

[**MappingResponse**](MappingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

