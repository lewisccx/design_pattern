package com.designpatterns.polymorphism;

public class OverloadingExample {

}

class Puppy{
    public void bark(){
        System.out.println("woof ");
    }

    //overloading method
    public void bark(int num){
        System.out.println("overloading bark()");
        for(int i=0; i<num; i++)
            System.out.println("woof ");
    }
}

class OverloadingTest{
    public static void main(String [] args){
        Puppy dog = new Puppy();
        dog.bark();
        dog.bark(2);
    }
}
