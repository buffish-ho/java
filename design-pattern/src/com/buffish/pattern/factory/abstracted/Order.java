package com.buffish.pattern.factory.abstracted;

public interface Order {
    Pay getPay();
    Refund getRefund();
}
