package com.designpatterns.state.solution;

public class ShopeePay implements PaymentMethod {

    @Override
    public void payment() {
        System.out.println("make payment with ShopeePay");
    }
}
