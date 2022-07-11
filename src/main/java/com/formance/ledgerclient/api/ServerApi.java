package com.formance.ledgerclient.api;

import com.formance.ledgerclient.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.formance.ledgerclient.model.ConfigInfoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ServerApi {
  /**
   * Show server information.
   * 
   * @return Call&lt;ConfigInfoResponse&gt;
   */
  @GET("_info")
  Call<ConfigInfoResponse> getInfo();
    

}
