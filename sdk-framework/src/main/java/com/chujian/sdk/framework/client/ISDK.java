package com.chujian.sdk.framework.client;

import com.chujian.sdk.framework.parameter.Params;

public interface ISDK<
        INIT extends Params,
        LOGIN extends Params,
        SWITCHACCOUNT extends Params,
        PERSONALCENTER extends Params,
        PAY extends Params,
        EXIT extends Params
        > {


    // 初始化
    void init(INIT init);

    // 登陆
    void login(LOGIN login);

    // 切换账号
    void switchAccount(SWITCHACCOUNT switchaccount);

    // 打开个人中心
    void personalCenter(PERSONALCENTER personalcenter);

    // 支付
    void pay(PAY pay);


    // 退出
    void exit(EXIT exit);


}
