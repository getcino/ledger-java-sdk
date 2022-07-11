package com.formance.ledgerclient.api;

import com.formance.ledgerclient.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.formance.ledgerclient.model.StatsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StatsApi {
  /**
   * Get Stats
   * Get ledger stats (aggregate metrics on accounts and transactions) The stats for account 
   * @param ledger name of the ledger (required)
   * @return Call&lt;StatsResponse&gt;
   */
  @GET("{ledger}/stats")
  Call<StatsResponse> readStats(
    @retrofit2.http.Path("ledger") String ledger
  );

}
