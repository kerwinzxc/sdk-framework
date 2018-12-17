package com.chujian.sdk.framework.parameter;

import android.app.Application;

import com.chujian.sdk.framework.callback.InitCallback;

public class InitParams implements Params {

    private static InitParams initParams;

    private InitParams() {
    }

    private static InitParams getInstance() {
        if (initParams == null) {
            synchronized (InitParams.class) {
                initParams = new InitParams();
            }
        }
        return initParams;
    }

    Application application;



    InitCallback callback;




    public Application getApplication() {
        return application;
    }



    public InitCallback getCallback() {
        return callback;
    }

    public static class Builder {
        private static Builder builder;
        private static InitParams initParams;

        private Builder() {
            initParams = getInstance();
        }


        public static Builder bulider() {

            if (builder == null) {
                synchronized (Builder.class) {
                    builder = new Builder();
                }
            }
            return builder;
        }

        public Builder application(Application application) {
            initParams.application = application;
            return this;
        }


        public Builder callBack(InitCallback callback) {
            initParams.callback = callback;
            return this;
        }


        public InitParams build() {
            return initParams;
        }

    }
}
