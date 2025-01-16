package com.threads.multithreading;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/
public class ThreadExample1 {
    public static void main(String[] args) {
        System.out.println("My name is suraj prajapati");

        System.out.println("Before changing the thread details");

        // get thread name
        String currThreadName = Thread.currentThread().getName();
        System.out.println("Current Thread is : " + currThreadName);

        // get thread priority
        int currThreadPriority = Thread.currentThread().getPriority();
        System.out.println("Current Thread priority is : " + currThreadPriority);

        System.out.println("After changing the thread details");

        // changing thread details
        Thread currThread = Thread.currentThread();
        currThread.setName("Main Thread");
        currThread.setPriority(1);

        // get thread name
        currThreadName = Thread.currentThread().getName();
        System.out.println("Current Thread is : " + currThreadName);

        // get thread priority
        currThreadPriority = Thread.currentThread().getPriority();
        System.out.println("Current Thread priority is : " + currThreadPriority);




    }
}
