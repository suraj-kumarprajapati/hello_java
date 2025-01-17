package com.threads.multithreading;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/



/*
    join() method & isAlive() method
*/


class CustomThread implements Runnable {

        public void run() {
            System.out.println("Custom Thread started");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {
                System.out.println("some error occured");
            }
            System.out.println("Custom Thread ended");
        }

}


public class ThreadExample7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread Started");

        CustomThread ct = new CustomThread();
        Thread t = new Thread(ct);

        System.out.println(t.isAlive());  // false
        t.start();
        System.out.println(t.isAlive());  // true

        t.join();   // main thread will wait until and unless custom thread is finished

        System.out.println("Main thread ended");
    }
}
