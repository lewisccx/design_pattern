package com.designpatterns.encapsulation;

/*
* Problem:
* Account balance can be access directly from outside or multiple class
* */

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance = -1;
    }
}
