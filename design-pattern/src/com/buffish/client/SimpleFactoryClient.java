package com.buffish.client;

import com.buffish.pattern.factory.simple.*;

public class SimpleFactoryClient {
    static { PatternClient.ready("简单工厂模式"); }
    public static void run() {
        Pay ali = PayFactory.createPay(PayType.ALI_PAY);
        ali.unifiedorder();

        Pay wechat = PayFactory.createPay(PayType.WECHAT_PAY);
        wechat.unifiedorder();
    }
}
