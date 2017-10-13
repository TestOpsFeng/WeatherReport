package com.it.weatherreport.net;

import com.squareup.okhttp.Response;

/**
 * Created by lenovo on 2017/10/10.
 */
public interface HttpListener {
    Response Success();
    void Failure();
}
