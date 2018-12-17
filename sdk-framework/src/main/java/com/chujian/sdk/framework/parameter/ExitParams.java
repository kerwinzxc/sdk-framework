package com.chujian.sdk.framework.parameter;

import com.chujian.sdk.framework.callback.ExitCallback;

public class ExitParams implements Params {

    private static ExitParams exitParams;

    private static ExitParams getInstance() {
        if (exitParams == null) {
            synchronized (ExitParams.class) {
                exitParams = new ExitParams();
            }
        }
        return exitParams;
    }

    private ExitParams() {
    }

    ExitCallback callback;

    public static class Builder {
        private static Builder builder;
        private static ExitParams exitParams;

        private Builder() {
            exitParams = getInstance();
        }


        public static Builder bulider() {

            if (builder == null) {
                synchronized (Builder.class) {
                    builder = new Builder();
                }
            }
            return builder;
        }

        public Builder callBack(ExitCallback callback) {
            exitParams.callback = callback;
            return this;
        }

        public ExitParams build() {
            return exitParams;
        }


    }
}