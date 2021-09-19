package com.designpatterns.polymorphism;

public class CheckBox extends  UIControl {
    @Override
    public void draw() {
        System.out.println("drawing a default checkbox");
    }
    //Overloading occurs when two or more methods in one class have the same method name but different parameters.

    //Overriding occurs when two methods have the same method name and parameters.
    // One of the methods is in the parent class, and the other is in the child class.
    // Overriding allows a child class to provide the specific implementation of a method
    // that is already present in its parent class.
    //Overloading
    public void draw(int length, int width){
        System.out.println(String.format("drawing a checkbox with length: %d and width %d", length, width));
    }
}
