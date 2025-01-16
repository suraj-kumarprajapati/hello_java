package com.threads.multithreading;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

class MyThread extends Thread {
    public void run() {
        System.out.println("Inside MyThread");
    }
}


public class ThreadExample2 {
    public static void main(String[] args) {
        System.out.println("Inside Main Thread");

        Thread myThread = new MyThread();
        myThread.start();
    }
}
