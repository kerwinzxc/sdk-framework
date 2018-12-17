package com.chujian.framework.app;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.chujian.sdk.framework.callback.InitCallback;
import com.chujian.sdk.framework.client.CJSDK;
import com.chujian.sdk.framework.parameter.InitParams;
import com.chujian.th.THImpl;

public class App extends Application {

    private static final String TAG = "App";

    private static CJSDK cjsdk;

    @Override
    public void onCreate() {
        super.onCreate();


        cjsdk = CJSDK.getInstance();


        cjsdk.registerCallBack(new THImpl());

        Log.e(TAG, "cjsdk = " + cjsdk);


        InitParams initParams = InitParams.Builder
                .bulider()
                .application(this)
                .callBack(new InitCallback() {
                    @Override
                    public void onSuccess(Object o) {

                    }

                    @Override
                    public void onFailure(Object o) {

                    }
                })
                .build();


        if (cjsdk != null) {

            if (initParams != null) {

                boolean b = cjsdk == null;
                boolean b1 = initParams == null;
                Log.e(TAG, "b=" + b);
                Log.e(TAG, "b1=" + b1);


                try {
                    cjsdk.init(initParams);
                }catch (Exception e){
                    e.printStackTrace();
                }

            } else {
                Log.e(TAG, "initParams NULL");
            }

        } else {
            Log.e(TAG, "cjsdk NULL");
        }


    }

    public static CJSDK getCjsdk() {
        return cjsdk;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //因为引用的包过多，实现多包问题
        MultiDex.install(this);
    }
}
