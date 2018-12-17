package com.chujian.sdk.framework.parameter;

import com.chujian.sdk.framework.callback.SwitchAccountCallback;

public class SwitchAccountParams implements Params {

    private static SwitchAccountParams switchAccountParams;


    public static SwitchAccountParams getInstance() {

        if (switchAccountParams == null) {
            synchronized (SwitchAccountParams.class) {
                switchAccountParams = new SwitchAccountParams();
            }
        }

        return switchAccountParams;
    }


    private SwitchAccountParams() {
    }


    SwitchAccountCallback callBack;


    public static class Builder {
        private static Builder builder;

        private static SwitchAccountParams switchAccountParams;

        private Builder() {
            switchAccountParams = getInstance();
        }

        public static Builder bulider() {

            if (builder == null) {
                synchronized (Builder.class) {
                    builder = new Builder();
                }
            }
            return builder;
        }


        public Builder callBack(SwitchAccountCallback callback) {
            switchAccountParams.callBack = callback;
            return this;
        }


        public SwitchAccountParams build() {
            return switchAccountParams;
        }
    }

}
