package com.example.myweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * 城市类
 */

public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;//城市代号
    private int provinceId;//所属省份的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
