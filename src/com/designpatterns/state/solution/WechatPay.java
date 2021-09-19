package com.designpatterns.state.solution;

public class WechatPay implements PaymentMethod {
    @Override
    public void payment() {
        System.out.println("make payment with WechatPay");
    }
}
