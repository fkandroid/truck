package com.example.swolf.info;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.swolf.httpclient.TruckHttpClient
import com.loopj.android.http.JsonHttpResponseHandler;

/**
 * Created by swolf on 16/6/27.
 */
public class TruckInfo {
    public void getGoodTypes() throws JSONException {
        TruckHttpClient.get("good/types", null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                boolean success = response.getBoolean("success");

                if (success) {
                    JSONArray jsonData = response.getJSONArray("data");
                    String[] arr = new String[jsonData.length()];
                    for(int i=0; i < jsonData.length(); i++) {
                        arr[i] = jsonData.getString(i);
                    }
                    return arr;
                } else {
                    return ;
                }
            }
        });
    }
}
