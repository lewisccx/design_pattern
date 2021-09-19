package com.designpatterns.polymorphism;

public abstract class UIControl {

    public void enable(){
        System.out.println("Enabled");
    }

    public abstract void draw();

    public abstract void draw(int l, int w);
}
