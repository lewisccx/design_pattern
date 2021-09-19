package com.designpatterns.encapsulation;

public class NewAccountMain {
    public static void main(String[] args) {

        NewAccount account = new NewAccount();
        account.deposit(20);
        account.withdraw(5);
        System.out.println("amount: " + account.getBalance());
    }
}
