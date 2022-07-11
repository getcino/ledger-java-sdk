package com.formance.ledgerclient.api;

import com.formance.ledgerclient.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TransactionsApi {
  /**
   * Set the metadata of a transaction by its ID.
   * 
   * @param ledger Name of the ledger. (required)
   * @param txid Transaction ID. (required)
   * @param requestBody metadata (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{ledger}/transactions/{txid}/metadata")
  Call<Void> addMetadataOnTransaction(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Path("txid") Integer txid, @retrofit2.http.Body Map<String, Object> requestBody
  );

  /**
   * Count the transactions from a ledger.
   * 
   * @param ledger Name of the ledger. (required)
   * @param reference Filter transactions by reference field. (optional)
   * @param account Filter transactions with postings involving given account, either as source or destination. (optional)
   * @param source Filter transactions with postings involving given account at source. (optional)
   * @param destination Filter transactions with postings involving given account at destination. (optional)
   * @return Call&lt;Void&gt;
   */
  @HEAD("{ledger}/transactions")
  Call<Void> countTransactions(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Query("reference") String reference, @retrofit2.http.Query("account") String account, @retrofit2.http.Query("source") String source, @retrofit2.http.Query("destination") String destination
  );

  /**
   * Create a new transaction to a ledger.
   * 
   * @param ledger Name of the ledger. (required)
   * @param transactionData  (required)
   * @param preview Set the preview mode. Preview mode doesn&#39;t add the logs to the database or publish a message to the message broker. (optional)
   * @return Call&lt;TransactionsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{ledger}/transactions")
  Call<TransactionsResponse> createTransaction(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Body TransactionData transactionData, @retrofit2.http.Query("preview") Boolean preview
  );

  /**
   * Create a new batch of transactions to a ledger.
   * 
   * @param ledger Name of the ledger. (required)
   * @param transactions  (required)
   * @return Call&lt;TransactionsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{ledger}/transactions/batch")
  Call<TransactionsResponse> createTransactions(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Body Transactions transactions
  );

  /**
   * Get transaction from a ledger by its ID.
   * 
   * @param ledger Name of the ledger. (required)
   * @param txid Transaction ID. (required)
   * @return Call&lt;TransactionResponse&gt;
   */
  @GET("{ledger}/transactions/{txid}")
  Call<TransactionResponse> getTransaction(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Path("txid") Integer txid
  );

  /**
   * List transactions from a ledger.
   * List transactions from a ledger, sorted by txid in descending order.
   * @param ledger Name of the ledger. (required)
   * @param after Pagination cursor, will return transactions after given txid (in descending order). (optional)
   * @param reference Find transactions by reference field. (optional)
   * @param account Find transactions with postings involving given account, either as source or destination. (optional)
   * @param source Find transactions with postings involving given account at source. (optional)
   * @param destination Find transactions with postings involving given account at destination. (optional)
   * @param startTime Filter transactions that occurred after this timestamp. The format is RFC3339 and is inclusive (for example, 12:00:01 includes the first second of the minute).  (optional)
   * @param endTime Filter transactions that occurred before this timestamp. The format is RFC3339 and is exclusive (for example, 12:00:01 excludes the first second of the minute).  (optional)
   * @param paginationToken Parameter used in pagination requests. Maximum page size is set to 15. Set to the value of next for the next page of results.  Set to the value of previous for the previous page of results. No other parameters can be set when the pagination token is set.  (optional)
   * @return Call&lt;ListTransactionsResponse&gt;
   */
  @GET("{ledger}/transactions")
  Call<ListTransactionsResponse> listTransactions(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Query("after") String after, @retrofit2.http.Query("reference") String reference, @retrofit2.http.Query("account") String account, @retrofit2.http.Query("source") String source, @retrofit2.http.Query("destination") String destination, @retrofit2.http.Query("start_time") String startTime, @retrofit2.http.Query("end_time") String endTime, @retrofit2.http.Query("pagination_token") String paginationToken
  );

  /**
   * Revert a ledger transaction by its ID.
   * 
   * @param ledger Name of the ledger. (required)
   * @param txid Transaction ID. (required)
   * @return Call&lt;TransactionResponse&gt;
   */
  @POST("{ledger}/transactions/{txid}/revert")
  Call<TransactionResponse> revertTransaction(
    @retrofit2.http.Path("ledger") String ledger, @retrofit2.http.Path("txid") Integer txid
  );

}
