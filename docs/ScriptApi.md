# ScriptApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**runScript**](ScriptApi.md#runScript) | **POST** {ledger}/script | Execute a Numscript. |



## runScript

> ScriptResult runScript(ledger, script, preview)

Execute a Numscript.

### Example

```java
// Import classes:
import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.ApiException;
import com.formance.ledgerclient.Configuration;
import com.formance.ledgerclient.auth.*;
import com.formance.ledgerclient.models.*;
import com.formance.ledgerclient.api.ScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        ScriptApi apiInstance = new ScriptApi(defaultClient);
        String ledger = "ledger001"; // String | Name of the ledger.
        Script script = new Script(); // Script | 
        Boolean preview = true; // Boolean | Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
        try {
            ScriptResult result = apiInstance.runScript(ledger, script, preview);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptApi#runScript");
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
| **script** | [**Script**](Script.md)|  | |
| **preview** | **Boolean**| Set the preview mode. Preview mode doesn&#39;t add the logs to the database or publish a message to the message broker. | [optional] |

### Return type

[**ScriptResult**](ScriptResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

