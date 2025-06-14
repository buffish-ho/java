package com.buffish.pattern.factory.simple;

public class PayFactory {
    public static Pay createPay(PayType type) {
        return switch (type) {
            case ALI_PAY -> new AliPay();
            case WECHAT_PAY -> new WechatPay();
            default -> null;
        };
    }
}
