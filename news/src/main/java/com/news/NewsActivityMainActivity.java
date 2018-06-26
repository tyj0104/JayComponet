package com.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.httplibrary.http.http.tools.RxBus;

import io.reactivex.disposables.Disposable;


public class NewsActivityMainActivity extends AppCompatActivity {
    String TAG = "NewsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity_main);
        Disposable main = RxBus.getInstance()
                .<String>asObservable("main").subscribe(
                        str -> {
                            Log.d(TAG, "日志"+str);
                        });

    }
}
