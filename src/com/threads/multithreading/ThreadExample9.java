package com.threads.multithreading;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/



/*
    synchronized -> when multiple threads want to access the same resource
*/


class ThreadISync implements Runnable {

        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
                Thread.sleep(2000);
                synchronized (this) {
                    System.out.println(Thread.currentThread().getName() + " got into car");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " started driving the car");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " came back and parked the car");
                    Thread.sleep(2000);
                }
            }
            catch (Exception e) {
                System.out.println("Some Error Occured");
            }
        }

}


public class ThreadExample9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread Started");

        ThreadISync ts = new ThreadISync();

        Thread t1 = new Thread(ts);
        t1.setName("SON-1");
        Thread t2 = new Thread(ts);
        t2.setName("SON-2");
        Thread t3 = new Thread(ts);
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread ended");
    }
}
