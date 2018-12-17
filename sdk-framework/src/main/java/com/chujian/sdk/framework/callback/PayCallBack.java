package com.chujian.sdk.framework.callback;

public interface PayCallBack <T, E, C>{



    void onSuccess(T t);

    void onFailure(E e);

    void onCancel(C c);

}
