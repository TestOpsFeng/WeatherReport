package com.it.weatherreport.model;

import android.util.Log;

import com.google.gson.Gson;
import com.it.weatherreport.been.NowData;
import com.it.weatherreport.listener.IHomeModel;
import com.it.weatherreport.net.GetDataListener;
import com.it.weatherreport.net.HttpUtils;

import java.io.IOException;

/**
 * Created by lenovo on 2017/10/10.
 */
public class HomeModel implements IHomeModel{
    @Override
    public NowData getNowData() {
        String url = "https://api.seniverse.com/v3/weather/now.json?key=miyyhb4jhyyi7xzf&location=beijing&language=zh-Hans&unit=c";
        HttpUtils.getRequest(url, new GetDataListener() {
            @Override
            public void Success(String json) {
                Log.e("ResponseSuccess12345" , json);
                NowData nowData = new Gson().fromJson(json, NowData.class);
                Log.e("HomeModel","-----------"+ nowData.getResults().get(0).getLocation().getName());
            }

            @Override
            public void Failure(IOException e) {
                Log.e("IOException","IOException------------------------");
            }
        });
        return null;
    }
}
