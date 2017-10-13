package com.it.weatherreport.net;

import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by lenovo on 2017/10/12.
 */
public interface GetDataListener {
    void Success(String response);
    void Failure(IOException e);
}
