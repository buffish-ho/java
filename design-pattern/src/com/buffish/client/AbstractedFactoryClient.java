package com.buffish.client;

import com.buffish.pattern.factory.abstracted.Order;
import com.buffish.pattern.factory.abstracted.OrderFactory;
import com.buffish.pattern.factory.abstracted.OrderType;

public class AbstractedFactoryClient {
    static { PatternClient.ready("抽象工厂模式"); }
    public static void run() {
        Order ali = OrderFactory.getFactory(OrderType.ALI);
        ali.getPay().unifiedorder();
        ali.getRefund().refund();

        Order wechat = OrderFactory.getFactory(OrderType.WECHAT);
        wechat.getPay().unifiedorder();
        wechat.getRefund().refund();
    }
}
