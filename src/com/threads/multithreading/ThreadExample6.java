package com.threads.multithreading;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/



/*
    There are five states of threads -
    1. New -> when thread is created
    2. Runnable -> when thread is started or given to the thread scheduler
    3. Running -> when thread is running
    4. Wait/Blocked -> when thread is blocked ( if encounters sleep, wait, etc. ) -> again goes back to runnable state
    5. Dead -> when thread execution is completed
*/


class MyThreadState implements Runnable {

        public void run() {
            // running
            System.out.println("Thread started");
            try {
                Thread.sleep(2000);  // blocked -> again goes back to runnable -> running
            }
            catch(Exception e) {
                System.out.println("some error occured");
            }
            System.out.println("Thread completed");  // after completion, dead
        }

}


public class ThreadExample6 {
    public static void main(String[] args) {
        System.out.println("Inside Main Thread");
        MyThreadState ts = new MyThreadState();
        Thread t = new Thread(ts);  // new
        t.start();   // runnable
    }
}
