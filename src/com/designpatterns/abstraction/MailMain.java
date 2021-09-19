package com.designpatterns.abstraction;

public class MailMain {
    public static void main(String[] args) {
        MailService mailService = new MailService();
        mailService.sendMail();
    }
}
