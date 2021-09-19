package com.designpatterns.state.solution;

public class Order {

    private PaymentMethod paymentMethod;


    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(){
        paymentMethod.payment();
    }
}
