package com.chujian.sdk.framework.application;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;


/**
 * @author maohuawei created in 2018/12/15
 *
 *
 */
public class CJSDKApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //因为引用的包过多，实现多包问题
        MultiDex.install(this);
    }
}
