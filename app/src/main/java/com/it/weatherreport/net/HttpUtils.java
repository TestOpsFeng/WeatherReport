package com.it.weatherreport.net;

import android.util.Log;

import com.google.gson.Gson;
import com.it.weatherreport.been.NowData;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.URL;

/**
 * Created by lenovo on 2017/10/10.
 */
public class HttpUtils {

    public static void getRequest(String url,final GetDataListener listener){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.e("Http1", "failure");
                listener.Failure(e);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                String result = response.body().string();
                Log.e("Http1", "gggggggggggg" + result);
                Log.e("Http1", "success");
                NowData nowData = new Gson().fromJson(result, NowData.class);
                listener.Success(result);
            }
        });
    }
}
