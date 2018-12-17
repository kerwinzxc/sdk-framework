package com.chujian.sdk.framework.callback;

public interface LoginCallback<T, E, C> {


    void onSuccess(T t);

    void onFailure(E e);

    void onCancel(C c);


}
