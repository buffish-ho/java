package com.buffish.client;

import com.buffish.pattern.factory.method.*;

public class FactoryMethodClient {
    static { PatternClient.ready("工厂方法模式"); }
    public static void run() {
        PayFactory aliFactory = new AliPayFactory();
        Pay ali = aliFactory.getPay();
        ali.unifiedorder();

        PayFactory wechatFactory = new WechatPayFactory();
        Pay wechat = wechatFactory.getPay();
        wechat.unifiedorder();
    }
}
