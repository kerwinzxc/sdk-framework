package com.chujian.sdk.framework.parameter;

import com.chujian.sdk.framework.callback.PayCallBack;

public class PayParams implements Params {

    private static PayParams payParams;

    public static PayParams getInstance() {

        if (payParams == null) {
            synchronized (PayParams.class) {
                payParams = new PayParams();
            }
        }
        return payParams;
    }

    private PayParams() {
    }


    PayCallBack callBack;

    public static class Builder {
        private static Builder builder;
        private static PayParams payParams;

        private Builder() {
            payParams = getInstance();
        }
        public static Builder bulider() {

            if (builder == null) {
                synchronized (Builder.class) {
                    builder = new Builder();
                }
            }
            return builder;
        }
        public Builder callBack(PayCallBack callback) {
            payParams.callBack = callback;
            return this;
        }


        public PayParams build() {
            return payParams;
        }

    }


}
