package com.formance.ledgerclient.api;

import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.model.ConfigInfoResponse;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServerApi
 */
public class ServerApiTest {

    private ServerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ServerApi.class);
    }

    /**
     * Show server information.
     *
     * 
     */
    @Test
    public void getInfoTest() {
        // ConfigInfoResponse response = api.getInfo();

        // TODO: test validations
    }
}
