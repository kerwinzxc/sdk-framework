package com.chujian.th;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.chujian.client.ChuJianSDK;
import com.chujian.sdkcommon.inter.StatusListener;
import com.chujian.sdk.framework.client.CJSDK;
import com.chujian.sdk.framework.client.CJSDKImpl;
import com.chujian.sdk.framework.client.ISDK;
import com.chujian.sdk.framework.parameter.ExitParams;
import com.chujian.sdk.framework.parameter.InitParams;
import com.chujian.sdk.framework.parameter.LoginParams;
import com.chujian.sdk.framework.parameter.Params;
import com.chujian.sdk.framework.parameter.PayParams;
import com.chujian.sdk.framework.parameter.PersonalCenterParams;
import com.chujian.sdk.framework.parameter.SwitchAccountParams;
import com.chujian.thsdk.init.ChuJianSDKConfig;
import com.chujian.thsdk.view.activity.MainActivity;

public class THImpl extends CJSDKImpl {

    private static final String TAG = "THImpl";


    private Application application;

    @Override
    public void init(InitParams initParams) {
        Log.e(TAG, "init: " );


        Application application = initParams.getApplication();
        this.application=application;
        ChuJianSDK.application(application);

    }

    @Override
    public void login(final LoginParams loginParams) {

        Log.e(TAG, "login: " );

        ChuJianSDKConfig build =
                ChuJianSDK.getSDKConfig()
                        .application(application)
                        .debug(true)
                        .client_id("app")
                        .client_secret("123456")
                        .setStatusListener(new StatusListener() {
                            @Override
                            public void onSuccess() {
                                Activity activity = loginParams.getActivity();

                                //TODO 4. 初始化成功 进入游戏
                                activity.startActivity(new Intent(activity, MainActivity.class));
                                activity.finish();
                            }

                            @Override
                            public void onFailure(Throwable e) {

                                e.printStackTrace();
                            }
                        }).build();

        // TODO 3. 初始化SDK
        ChuJianSDK.init(build);
    }

    @Override
    public void switchAccount(SwitchAccountParams switchAccountParams) {
        Log.e(TAG, "switchAccount: ");
    }

    @Override
    public void personalCenter(PersonalCenterParams personalCenterParams) {
        Log.e(TAG, "personalCenter: ");
    }

    @Override
    public void pay(PayParams payParams) {
        Log.e(TAG, "pay: " );
    }

    @Override
    public void exit(ExitParams exitParams) {
        Log.e(TAG, "exit: " );
    }
}
