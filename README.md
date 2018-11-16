# 初见用户支付SDK

## firstmeet-andsdk-ups-framwork       
    F8Framework 初见用户支付SDK框架
	
	渠道统一框架接口，所有渠道必须实现本框架接口，统一游戏app接入方式
	

## 功能清单
- 用户登录、帐号注册、快速注册、忘记密码、修改密码、修改个人信息（如绑定电邮地址）等用户账号相关功能
- facebook、google、wechat、twitter等第三方登录
- 上报各种事件日志

## 依赖
依赖使用firstmeet-andsdk-mta-framework上报埋点数据

## UPS SDK实现渠道清单
编号|工程名称|说明
---|:---|---
1| firstmeet-andsdk-ups-chujian |       初见渠道用户支付SDK实现 F8Framework
2| firstmeet-andsdk-ups-huawei  |       huawei渠道用户支付SDK实现 F8Framework
3| firstmeet-andsdk-ups-vivo |          Vivo渠道用户支付SDK实现 F8Framework
4| firstmeet-andsdk-ups-oppo |          Oppo渠道用户支付SDK实现 F8Framework
5| firstmeet-andsdk-ups-uc   |          uc渠道用户支付SDK实现 F8Framework
6| firstmeet-andsdk-ups-xiaomi |        xiaomi渠道用户支付SDK实现 F8Framework
7| firstmeet-andsdk-ups-baidu  |        baidu渠道用户支付SDK实现 F8Framework
8| firstmeet-andsdk-ups-google  |       google渠道用户支付SDK实现 F8Framework

## UPS SDK语言包清单
编号|工程名称|说明
---|:---|---
1| firstmeet-andsdk-ups-langpack-Thai |       用户支付SDK泰文语言包
2| firstmeet-andsdk-ups-langpack-Japanese  |  用户支付SDK日文语言包
3| firstmeet-andsdk-ups-langpack-Vietnamese  |  用户支付SDK越南文语言包
4| firstmeet-andsdk-ups-langpack-English  |  用户支付SDK英文语言包


# 初见MTA SDK
## firstmeet-andsdk-mta-framwork       
    MtaFramework 初见MTA SDK框架
	
	MTA统一框架接口，封装第三方事件、日志上报SDK,提供统一接口

## 功能清单
- app激活事件、app激活成功事件、用户登录事件、帐号注册事件、快速注册事件等采集与上报

## 封装实现MTA SDK清单
编号|工程名称|说明
---|:---|---
1| firstmeet-andsdk-mta-chujian |       初见MTA SDK实现 MtaFramework
2| firstmeet-andsdk-mta-toutiao  |      今日头条跟踪SDK实现封装 MtaFramework
3| firstmeet-andsdk-mta-qq  |           腾讯移动分析SDK实现封装 MtaFramework



## 参考资料
- [iOS 游戏渠道SDK 抽象工程封装](https://blog.csdn.net/SeanHuang1661/article/details/50131469)
- [U8SDK IOS游戏接入指南](http://www.6xsdk.com/u8-wiki/#!ios_game_doc.md)
- [Spotify iOS SDK ](https://github.com/spotify/ios-sdk)
- [TypeSdk手游聚合SDK](http://www.typesdk.com/)



