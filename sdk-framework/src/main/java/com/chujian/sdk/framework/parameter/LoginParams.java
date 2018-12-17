package com.chujian.sdk.framework.parameter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.chujian.sdk.framework.callback.LoginCallback;

public class LoginParams implements Params {

    private static LoginParams loginParams;

    private LoginParams() {
    }


    Activity activity;

    public Activity getActivity() {
        return activity;
    }

    private static LoginParams getInstance() {
        if (loginParams == null) {
            synchronized (LoginParams.class) {
                loginParams = new LoginParams();
            }
        }

        return loginParams;
    }


    LoginCallback callback;


    public static class Builder {
        private static Builder builder;
        private static LoginParams loginParams;

        private Builder() {
            loginParams = getInstance();
        }

        public static Builder bulider() {

            if (builder == null) {
                synchronized (Builder.class) {
                    builder = new Builder();
                }
            }
            return builder;
        }

        public Builder callBack(LoginCallback callback) {
            loginParams.callback = callback;
            return this;
        }


        public Builder activity(Activity activity) {
            loginParams.activity = activity;
            return this;
        }


        public LoginParams build() {
            return loginParams;
        }

    }
}
