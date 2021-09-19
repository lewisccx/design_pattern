package com.designpatterns.polymorphism;

public class TextBox extends UIControl{

    @Override
    public void draw() {
        System.out.println("Drawing a textbox");
    }

    @Override
    public void draw(int l, int w) {

    }
}
