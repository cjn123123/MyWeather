package com.example.myweather.gson;


/**
 * 当前空气质量情况
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
