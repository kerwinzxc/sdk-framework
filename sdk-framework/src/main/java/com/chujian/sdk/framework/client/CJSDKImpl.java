package com.chujian.sdk.framework.client;

import com.chujian.sdk.framework.parameter.ExitParams;
import com.chujian.sdk.framework.parameter.InitParams;
import com.chujian.sdk.framework.parameter.LoginParams;
import com.chujian.sdk.framework.parameter.PayParams;
import com.chujian.sdk.framework.parameter.PersonalCenterParams;
import com.chujian.sdk.framework.parameter.SwitchAccountParams;

public  class CJSDKImpl implements ISDK<
        InitParams,
        LoginParams,
        SwitchAccountParams,
        PersonalCenterParams,
        PayParams,
        ExitParams
        > {

    private static CJSDKImpl cjsdk;

    protected CJSDKImpl(){}

    public static CJSDKImpl getInstance() {

        if(cjsdk==null){
            synchronized (CJSDKImpl.class){
                cjsdk=  new CJSDKImpl();
            }
        }
        return cjsdk;
    }


    private ISDK<
            InitParams,
            LoginParams,
            SwitchAccountParams,
            PersonalCenterParams,
            PayParams,
            ExitParams
            > callBack;

    public void registerCallBack(ISDK<
            InitParams,
            LoginParams,
            SwitchAccountParams,
            PersonalCenterParams,
            PayParams,
            ExitParams
            > callBack){
        this.callBack=callBack;
    }



    @Override
    public void init(InitParams initParams) {
        callBack.init(initParams);
    }

    @Override
    public void login(LoginParams loginParams) {
        callBack.login(loginParams);
    }

    @Override
    public void switchAccount(SwitchAccountParams switchAccountParams) {
        callBack.switchAccount(switchAccountParams);
    }

    @Override
    public void personalCenter(PersonalCenterParams personalCenterParams) {
        callBack.personalCenter(personalCenterParams);
    }

    @Override
    public void pay(PayParams payParams) {
        callBack.pay(payParams);
    }

    @Override
    public void exit(ExitParams exitParams) {
        callBack.exit(exitParams);
    }
}
