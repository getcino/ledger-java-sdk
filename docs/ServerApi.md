# ServerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInfo**](ServerApi.md#getInfo) | **GET** _info | Show server information. |



## getInfo

> ConfigInfoResponse getInfo()

Show server information.

### Example

```java
// Import classes:
import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.ApiException;
import com.formance.ledgerclient.Configuration;
import com.formance.ledgerclient.auth.*;
import com.formance.ledgerclient.models.*;
import com.formance.ledgerclient.api.ServerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ServerApi apiInstance = new ServerApi(defaultClient);
        try {
            ConfigInfoResponse result = apiInstance.getInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServerApi#getInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ConfigInfoResponse**](ConfigInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

