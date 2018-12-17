package com.chujian.sdk.framework.callback;

public interface InitCallback <T ,E>{


    void onSuccess(T t);

    void onFailure(E e);

}
