package com.jaycomponet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.httplibrary.http.http.tools.RxBus;
import com.news.NewsActivityMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RxBus.getInstance().post("main","App传来的数据");
        startActivity(new Intent(this, NewsActivityMainActivity.class));
    }
}
