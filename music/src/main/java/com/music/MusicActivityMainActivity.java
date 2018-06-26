package com.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MusicActivityMainActivity extends AppCompatActivity {
private  String TAG ="MusicActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity_main);
        Log.d(TAG,"music 页面");
    }
}
