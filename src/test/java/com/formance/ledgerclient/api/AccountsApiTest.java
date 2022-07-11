package com.formance.ledgerclient.api;

import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.model.GetAccount400Response;
import com.formance.ledgerclient.model.GetAccountResponse;
import com.formance.ledgerclient.model.ListAccounts400Response;
import com.formance.ledgerclient.model.ListAccountsResponse;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
public class AccountsApiTest {

    private AccountsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountsApi.class);
    }

    /**
     * Add metadata to an account.
     *
     * 
     */
    @Test
    public void addMetadataToAccountTest() {
        String ledger = null;
        String address = null;
        Map<String, Object> requestBody = null;
        // api.addMetadataToAccount(ledger, address, requestBody);

        // TODO: test validations
    }
    /**
     * Count the accounts from a ledger.
     *
     * 
     */
    @Test
    public void countAccountsTest() {
        String ledger = null;
        String address = null;
        Object metadata = null;
        // api.countAccounts(ledger, address, metadata);

        // TODO: test validations
    }
    /**
     * Get account by its address.
     *
     * 
     */
    @Test
    public void getAccountTest() {
        String ledger = null;
        String address = null;
        // GetAccountResponse response = api.getAccount(ledger, address);

        // TODO: test validations
    }
    /**
     * List accounts from a ledger.
     *
     * List accounts from a ledger, sorted by address in descending order.
     */
    @Test
    public void listAccountsTest() {
        String ledger = null;
        String after = null;
        String address = null;
        Object metadata = null;
        Long balance = null;
        String balanceOperator = null;
        String paginationToken = null;
        // ListAccountsResponse response = api.listAccounts(ledger, after, address, metadata, balance, balanceOperator, paginationToken);

        // TODO: test validations
    }
}
