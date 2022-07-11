package com.formance.ledgerclient.api;

import com.formance.ledgerclient.ApiClient;
import com.formance.ledgerclient.model.CreateTransaction400Response;
import com.formance.ledgerclient.model.CreateTransaction409Response;
import com.formance.ledgerclient.model.CreateTransactions400Response;
import com.formance.ledgerclient.model.GetTransaction400Response;
import com.formance.ledgerclient.model.GetTransaction404Response;
import com.formance.ledgerclient.model.ListAccounts400Response;
import com.formance.ledgerclient.model.ListTransactionsResponse;
import com.formance.ledgerclient.model.TransactionData;
import com.formance.ledgerclient.model.TransactionResponse;
import com.formance.ledgerclient.model.Transactions;
import com.formance.ledgerclient.model.TransactionsResponse;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsApi
 */
public class TransactionsApiTest {

    private TransactionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TransactionsApi.class);
    }

    /**
     * Set the metadata of a transaction by its ID.
     *
     * 
     */
    @Test
    public void addMetadataOnTransactionTest() {
        String ledger = null;
        Integer txid = null;
        Map<String, Object> requestBody = null;
        // api.addMetadataOnTransaction(ledger, txid, requestBody);

        // TODO: test validations
    }
    /**
     * Count the transactions from a ledger.
     *
     * 
     */
    @Test
    public void countTransactionsTest() {
        String ledger = null;
        String reference = null;
        String account = null;
        String source = null;
        String destination = null;
        // api.countTransactions(ledger, reference, account, source, destination);

        // TODO: test validations
    }
    /**
     * Create a new transaction to a ledger.
     *
     * 
     */
    @Test
    public void createTransactionTest() {
        String ledger = null;
        TransactionData transactionData = null;
        Boolean preview = null;
        // TransactionsResponse response = api.createTransaction(ledger, transactionData, preview);

        // TODO: test validations
    }
    /**
     * Create a new batch of transactions to a ledger.
     *
     * 
     */
    @Test
    public void createTransactionsTest() {
        String ledger = null;
        Transactions transactions = null;
        // TransactionsResponse response = api.createTransactions(ledger, transactions);

        // TODO: test validations
    }
    /**
     * Get transaction from a ledger by its ID.
     *
     * 
     */
    @Test
    public void getTransactionTest() {
        String ledger = null;
        Integer txid = null;
        // TransactionResponse response = api.getTransaction(ledger, txid);

        // TODO: test validations
    }
    /**
     * List transactions from a ledger.
     *
     * List transactions from a ledger, sorted by txid in descending order.
     */
    @Test
    public void listTransactionsTest() {
        String ledger = null;
        String after = null;
        String reference = null;
        String account = null;
        String source = null;
        String destination = null;
        String startTime = null;
        String endTime = null;
        String paginationToken = null;
        // ListTransactionsResponse response = api.listTransactions(ledger, after, reference, account, source, destination, startTime, endTime, paginationToken);

        // TODO: test validations
    }
    /**
     * Revert a ledger transaction by its ID.
     *
     * 
     */
    @Test
    public void revertTransactionTest() {
        String ledger = null;
        Integer txid = null;
        // TransactionResponse response = api.revertTransaction(ledger, txid);

        // TODO: test validations
    }
}
