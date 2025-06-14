package com.buffish.pattern.factory.method;

public class AliPayFactory implements PayFactory {
    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
