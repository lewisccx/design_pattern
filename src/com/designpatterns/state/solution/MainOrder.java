package com.designpatterns.state.solution;

public class MainOrder {

    public static void main(String[] args) {
        Order order = new Order();
        order.setPaymentMethod(new ShopeePay());
        order.makePayment();
    }
}
