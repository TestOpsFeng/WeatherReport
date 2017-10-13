package com.it.weatherreport.presenter;

import android.util.Log;

import com.it.weatherreport.been.NowData;
import com.it.weatherreport.listener.IHomeModel;
import com.it.weatherreport.listener.IHomeView;
import com.it.weatherreport.model.HomeModel;
import com.it.weatherreport.net.HttpUtils;

/**
 * Created by lenovo on 2017/10/10.
 */
public class HomePresenter {
    private IHomeView iHomeView;
    private IHomeModel iHomeModel;

    public HomePresenter(IHomeView view) {
        this.iHomeView = view;
        this.iHomeModel = new HomeModel();
    }
    public void showDetail(){
        //点击进入详情面
    }
    public void showHome(){
        Log.e("HomePresenter", "showHome");
        NowData nowData = iHomeModel.getNowData();
        iHomeView.showNowWeather(nowData);
    }
}
