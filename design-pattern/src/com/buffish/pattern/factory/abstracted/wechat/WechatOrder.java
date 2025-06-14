package com.buffish.pattern.factory.abstracted.wechat;

import com.buffish.pattern.factory.abstracted.*;

public class WechatOrder implements Order {
    @Override
    public Pay getPay() {
        return new WechatPay();
    }

    @Override
    public Refund getRefund() {
        return new WechatRefund();
    }
}
