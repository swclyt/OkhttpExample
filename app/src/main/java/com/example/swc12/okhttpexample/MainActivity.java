package com.example.swc12.okhttpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.swc12.okhttpexample.okhttputils.OkHttpUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_get;
    private Button btn_post;
    private TextView tv_info;
    final String tag = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_get = (Button) findViewById(R.id.btn_get);
        btn_post = (Button) findViewById(R.id.btn_post);
        tv_info = (TextView) findViewById(R.id.tv_info);

        btn_get.setOnClickListener(this);
        btn_post.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i(tag, "onClick( " + v.getId() + " )");
        switch (v.getId()) {
            case R.id.btn_get:
                Log.i(tag, "switch() : case R.id.btn_get");
                OkHttpUtils.get();
                break;
            case R.id.btn_post:
                Log.i(tag, "switch() : case R.id.btn_get");
                OkHttpUtils.post();
                break;
            default:
                break;
        }
    }


}
