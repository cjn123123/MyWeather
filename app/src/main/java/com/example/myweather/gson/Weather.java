package com.example.myweather.gson;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 天气的所有信息
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
