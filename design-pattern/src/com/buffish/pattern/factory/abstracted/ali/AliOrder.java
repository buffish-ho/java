package com.buffish.pattern.factory.abstracted.ali;

import com.buffish.pattern.factory.abstracted.*;

public class AliOrder implements Order {
    @Override
    public Pay getPay() {
        return new AliPay();
    }

    @Override
    public Refund getRefund() {
        return new AliRefund();
    }
}
