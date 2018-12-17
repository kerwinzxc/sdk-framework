package com.chujian.sdk.framework.client;

import android.app.Application;
import android.util.Log;

import com.chujian.sdk.framework.common.Common;
import com.chujian.sdk.framework.parameter.ExitParams;
import com.chujian.sdk.framework.parameter.InitParams;
import com.chujian.sdk.framework.parameter.LoginParams;
import com.chujian.sdk.framework.parameter.PayParams;
import com.chujian.sdk.framework.parameter.PersonalCenterParams;
import com.chujian.sdk.framework.parameter.SwitchAccountParams;

public class CJSDK implements ISDK<
        InitParams,
        LoginParams,
        SwitchAccountParams,
        PersonalCenterParams,
        PayParams,
        ExitParams
        > {

    private static final String TAG = "CJSDK";

    private static CJSDK cjsdk;

    private CJSDK() {
    }

    public static CJSDK getInstance() {
        if (cjsdk == null) {
            synchronized (CJSDK.class) {
                cjsdk = new CJSDK();
            }
        }
        return cjsdk;
    }


    @Override
    public void init(InitParams initParams) {
        if (initParams == null) {
            throw new NullPointerException("InitParams null");
        }

        Application application = initParams.getApplication();

        if (application == null) {
            throw new NullPointerException("Application null");
        }
        Common.application = application;

        CJSDKImpl.getInstance().init(initParams);
    }

    @Override
    public void login(LoginParams loginParams) {
        if (loginParams == null) {
            throw new NullPointerException("LoginParams null");
        }

        CJSDKImpl.getInstance().login(loginParams);
    }

    @Override
    public void switchAccount(SwitchAccountParams switchAccountParams) {

        if (switchAccountParams == null) {
            throw new NullPointerException("SwitchAccountParams null");
        }

        CJSDKImpl.getInstance().switchAccount(switchAccountParams);

    }

    @Override
    public void personalCenter(PersonalCenterParams personalCenterParams) {

        if (personalCenterParams == null) {
            throw new NullPointerException("PersonalCenterParams null");
        }

        CJSDKImpl.getInstance().personalCenter(personalCenterParams);

    }

    @Override
    public void pay(PayParams payParams) {
        if (payParams == null) {
            throw new NullPointerException("PayParams null");
        }

        CJSDKImpl.getInstance().pay(payParams);
    }

    @Override
    public void exit(ExitParams exitParams) {

        if (exitParams == null) {
            throw new NullPointerException("ExitParams null");
        }

        CJSDKImpl.getInstance().exit(exitParams);

    }


    public void registerCallBack(ISDK<
            InitParams,
            LoginParams,
            SwitchAccountParams,
            PersonalCenterParams,
            PayParams,
            ExitParams
            > callBack) {

        CJSDKImpl.getInstance().registerCallBack(callBack);


    }

}