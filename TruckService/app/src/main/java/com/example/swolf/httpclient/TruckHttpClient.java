package com.example.swolf.httpclient;

import com.loopj.android.http.*

/**
 * Created by swolf on 16/6/27.
 */
public class TruckHttpClient {
    private static final String BASE_URL = "http://192.168.1.100:40000/";

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params,
                           AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params,
                            AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

}
