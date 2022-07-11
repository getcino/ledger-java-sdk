# StatsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readStats**](StatsApi.md#readStats) | **GET** {ledger}/stats | Get Stats |



## readStats

> StatsResponse readStats(ledger)

Get Stats

Get ledger stats (aggregate metrics on accounts and transactions) The stats for account 

### Example

```java
// Import classes:
import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.ApiException;
import com.formance.ledgerclient.Configuration;
import com.formance.ledgerclient.auth.*;
import com.formance.ledgerclient.models.*;
import com.formance.ledgerclient.api.StatsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        StatsApi apiInstance = new StatsApi(defaultClient);
        String ledger = "ledger001"; // String | name of the ledger
        try {
            StatsResponse result = apiInstance.readStats(ledger);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsApi#readStats");
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
| **ledger** | **String**| name of the ledger | |

### Return type

[**StatsResponse**](StatsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

