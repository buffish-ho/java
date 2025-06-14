package com.buffish.pattern.factory.abstracted.wechat;

import com.buffish.pattern.factory.abstracted.Pay;

public class WechatPay implements Pay {
    @Override
    public void unifiedorder() {
        System.out.println("微信支付 统一下单实现");
    }
}
