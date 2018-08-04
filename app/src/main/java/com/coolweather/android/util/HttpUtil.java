package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);//发送请求，回调okhttp3.Callback接口，然后调用接口里面重写的两个方法，一个onResponse，一个onFailer
    }

}
