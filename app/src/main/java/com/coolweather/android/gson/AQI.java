package com.coolweather.android.gson;

/**
 * Created by lanjiang_15 on 2018/3/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
