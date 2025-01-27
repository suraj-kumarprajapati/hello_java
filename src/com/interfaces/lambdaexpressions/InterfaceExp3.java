package com.interfaces.lambdaexpressions;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*
    interface 3 types -
        1. single abstract interface - only 1 abstract method
        2. marker interface - 0 methods
        3. normal interface - multiples abstract methods

    java 8 new features in interfaces -
    1. default methods in interfaces
        - default method definition in possible from 1.8 onwards in interfaces
    2. static methods in interfaces
        - static methods can be defined inside interface
    3. functional interfaces
        - single abstract interface now called as functional interface

*/


interface Interface1 {

    void show();

    default void config() {
       System.out.println("interface1 config");
    }

    static void abc() {
        System.out.println("Inside abc method of interface1");
    }
}

class ClassB implements Interface1{

    @Override
    public void show() {
        System.out.println("inside show method implemented by classB of interface1");
    }
}



public class InterfaceExp3 {
    public static void main(String[] args) {
        Interface1 obj = new ClassB();
        obj.config();
        obj.show();

        /*
        obj.abc(); // error, static method so directly call the method with interface name

         */
    }
}
