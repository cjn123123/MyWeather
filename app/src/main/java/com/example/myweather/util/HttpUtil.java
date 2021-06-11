package com.example.myweather.util;

import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 使用Okhttp3发起Http请求访问网络
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                                   .url(address)
                                   .build();
        client.newCall(request).enqueue(callback);
    }
}
