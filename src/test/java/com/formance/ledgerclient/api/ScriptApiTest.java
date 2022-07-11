package com.formance.ledgerclient.api;

import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.model.Script;
import com.formance.ledgerclient.model.ScriptResult;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScriptApi
 */
public class ScriptApiTest {

    private ScriptApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScriptApi.class);
    }

    /**
     * Execute a Numscript.
     *
     * 
     */
    @Test
    public void runScriptTest() {
        String ledger = null;
        Script script = null;
        Boolean preview = null;
        // ScriptResult response = api.runScript(ledger, script, preview);

        // TODO: test validations
    }
}
