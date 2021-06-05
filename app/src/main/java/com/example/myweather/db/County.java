package com.example.myweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * 县类
 */

public class County extends LitePalSupport {
    private int id;
    private String CountyName;
    private String weatherId;//天气Id
    private int cityId;//所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
