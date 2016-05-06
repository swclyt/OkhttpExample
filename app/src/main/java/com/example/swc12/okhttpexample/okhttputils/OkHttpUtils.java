package com.example.swc12.okhttpexample.okhttputils;

import android.util.Log;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by swclyt on 2016/4/27.
 */
public class OkHttpUtils {
    private static final String tag = OkHttpUtils.class.getName();

    public static void get() {
        Log.i(tag, "get()");
        OkHttpClient mOkHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url("http://10.1.16.96/htyd/login.do?reqCode=login&username=18826418570&password=111&checkcode=1111").build();
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.i(tag, "onFailure : OkHttp Get Failure");
            }

            @Override
            public void onResponse(Response response) throws IOException {
                String htmlStr = response.body().string();
                Log.i(tag, "onResponse : " + htmlStr);
            }
        });
    }

    public static void post() {
        Log.i(tag, "post()");
        OkHttpClient mOkHttpClient = new OkHttpClient();
        RequestBody requestBody = new FormEncodingBuilder()
                .add("username", "18826418570")
                .add("password", "111")
                .add("checkcode", "1111")
                .build();
        Request request = new Request.Builder()
                .url("http://10.1.16.96/htyd/login.do?reqCode=login")
                .post(requestBody)
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.i(tag, "onFailure : OkHttp Post Failure");
            }

            @Override
            public void onResponse(Response response) throws IOException {
                String htmlStr = response.body().string();
                Log.i(tag, "onResponse : " + htmlStr);
                Gson gson = new Gson();
                String str = gson.toJson(htmlStr);
                LoginCallback login = gson.fromJson(htmlStr, LoginCallback.class);
                Log.i(tag, "gson.toJson : " + str);
            }
        });
    }
}
