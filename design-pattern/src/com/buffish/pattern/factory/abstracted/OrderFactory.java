package com.buffish.pattern.factory.abstracted;

import com.buffish.pattern.factory.abstracted.ali.AliOrder;
import com.buffish.pattern.factory.abstracted.wechat.WechatOrder;

public class OrderFactory {
    public static Order getFactory(OrderType type) {
        return switch (type) {
            case ALI -> new AliOrder();
            case WECHAT -> new WechatOrder();
            default -> null;
        };
    }
}
