package com.designpatterns.polymorphism;

public class UIMain {
    public static void main(String[] args) {
        drawUIControl(new CheckBox());
    }

    private static void drawUIControl(UIControl control) {
        control.draw(6,7);
        control.draw();
    }

}
