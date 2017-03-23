package com.example.swolf.truckservice;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.loopj.android.http.*;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Spinner dropDown = (Spinner) findViewById(R.id.type);

                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                            MainActivity.this,
                            android.R.layout.simple_list_item_1,
                            arr);
                    dropDown.setAdapter(adapter);
                } else {
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_LONG).show();
                }
            }

            // Toast.makeText(MainActivity.this, bytes.toString(), Toast.LENGTH_LONG).show();


        });
    }

}
