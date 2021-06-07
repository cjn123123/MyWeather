package com.example.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 城市基本信息
 */

public class Basic {
    @SerializedName("city")//@SerializedName建立JSON字段和java字段的映射
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;//更新时间

    }
}
