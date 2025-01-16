package com.threads.multithreading;

import java.util.Scanner;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/


// achieving multithreading using single run

class MyCustomizedThread extends Thread {
    public void run() {
        // get the current thread name
        String tName = Thread.currentThread().getName();

        if(tName.equals("calc")) {
            calc();
        }
        else if(tName.equals("msg")) {
            msg();
        }
    }

    public void calc() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println("Calculation result is : " + res);
    }

    public void msg() {
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


public class ThreadExample5 {
    public static void main(String[] args) {
        System.out.println("Inside Main Thread");

        Thread thread1 = new MyCustomizedThread();
        thread1.setName("calc");
        Thread thread2 = new MyCustomizedThread();
        thread2.setName("msg");

        thread1.start();
        thread2.start();

    }
}
