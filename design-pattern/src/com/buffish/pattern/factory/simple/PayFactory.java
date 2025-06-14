package com.buffish.pattern.factory.simple;

public class PayFactory {
    public static Pay getPay(PayType type) {
        return switch (type) {
            case ALI_PAY -> new AliPay();
            case WECHAT_PAY -> new WechatPay();
            default -> null;
        };
    }
}
