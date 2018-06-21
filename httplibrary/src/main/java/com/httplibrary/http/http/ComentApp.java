package com.httplibrary.http.http;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by dev_tyj on 2018/6/21.
 */

public class ComentApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
