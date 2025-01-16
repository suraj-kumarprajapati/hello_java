package com.threads.multithreading;

import java.util.Scanner;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

class Calc implements Runnable{
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println("Calculation result is : " + res);
    }
}

class Msg implements Runnable {
    public void run() {
        System.out.println("Displaying important messages ");
        try {
            for(int i=0; i<3; i++) {
                System.out.println("Focus is the key");
                Thread.sleep(3000);
            }
        }
        catch (Exception e) {
            System.out.println("Some Error...");
        }
    }
}



public class ThreadExample4 {
    public static void main(String[] args) {
        System.out.println("Inside Main Thread....");

        Calc calc = new Calc();
        Msg msg = new Msg();
        Thread t1 = new Thread(calc);
        Thread t2 = new Thread(msg);
        t1.start();
        t2.start();

    }
}
