package com.it.weatherreport.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.it.weatherreport.R;
import com.it.weatherreport.been.NowData;
import com.it.weatherreport.listener.IHomeView;
import com.it.weatherreport.presenter.HomePresenter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements IHomeView {

    private HomePresenter homePresenter;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);
        homePresenter = new HomePresenter(this);
        homePresenter.showHome();
    }

    @Override
    public void showNowWeather(final NowData been) {
//        listview.setAdapter(new BaseAdapter() {
//            @Override
//            public int getCount() {
//                return been.size();
//            }
//
//            @Override
//            public Object getItem(int position) {
//                return null;
//            }
//
//            @Override
//            public long getItemId(int position) {
//                return 0;
//            }
//
//            @Override
//            public View getView(int position, View convertView, ViewGroup parent) {
//                ViewHolder holder;
//                View view;
//                if (convertView == null) {
//                    holder = new ViewHolder();
//                    view = View.inflate(MainActivity.this, R.layout.list_home, null);
//                    holder.tv_city = (TextView) view.findViewById(R.id.tv_city);
//                    holder.tv_temperature = (TextView) view.findViewById(R.id.tv_temperature);
//                    holder.tv_weather = (TextView) view.findViewById(R.id.tv_weather);
//                    view.setTag(holder);
//                } else {
//                    holder = (ViewHolder) convertView.getTag();
//                    view = convertView;
//                }
////                holder.tv_city.setText(been.get(position).getResults().get(position).getLocation().getCountry());
////                holder.tv_temperature.setText(been.get(position).getResults().get(position).getNow().getTemperature());
////                holder.tv_weather.setText(been.get(position).getResults().get(position).getNow().getText());
//                return view;
//            }
//        });
    }

    static class ViewHolder {
        TextView tv_city;
        TextView tv_temperature;
        TextView tv_weather;
    }
}
