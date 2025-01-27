package com.interfaces.lambdaexpressions;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

interface Car {
    void drive();
}
//
//class RollsRoyce implements Car {
//    @Override
//    public void drive() {
//        System.out.println("driving...");
//    }
//}



public class AnonymousClass {
    public static void main(String[] args) {
        // creating the anonymous class to implement the Car interface
        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("driving...");
            }
        };

        car.drive();
    }
}
