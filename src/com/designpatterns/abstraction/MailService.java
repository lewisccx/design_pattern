package com.designpatterns.abstraction;

public class MailService {

    public void sendMail(){
        connect();
        authenticate();
        //send mail
        disconnect();
    }

    //hiding unnecessary details by changing to private modifier
    private void connect(){
        System.out.println("connected to mail server");
    }
    private void disconnect(){
        System.out.println("disconnected from mail server");
    }
    private void authenticate(){
        System.out.println("authenticated successfully");
    }
}
