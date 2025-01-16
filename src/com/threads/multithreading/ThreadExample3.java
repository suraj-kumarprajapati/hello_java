package com.threads.multithreading;

import java.util.Scanner;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

class Calculation extends Thread {
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

class Message extends Thread {
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



public class ThreadExample3 {
    public static void main(String[] args) {
        System.out.println("Inside Main Thread....");

        Thread calcThread = new Calculation();
        Thread msgThread = new Message();
        calcThread.start();
        msgThread.start();
    }
}
