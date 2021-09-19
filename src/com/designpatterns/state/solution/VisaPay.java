package com.designpatterns.state.solution;

public class VisaPay implements PaymentMethod {

    @Override
    public void payment() {
        System.out.println("make payment with VisaPay");
    }
}
