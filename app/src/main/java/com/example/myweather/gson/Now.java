package com.example.myweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * 当前的天气信息
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public String weatherId;

    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
