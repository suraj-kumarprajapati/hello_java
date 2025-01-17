package com.threads.multithreading;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/



/*
    interrupt() -> thread can be interrupted in the blcoked/waiting state, it can not be interrupted during the running state
*/


class ThreadInterrupt implements Runnable {

        public void run() {
            System.out.println("Inside ThreadInterrupt");
            try {
                for(int i=0; i<3; i++) {
                    System.out.println("Focus is the key");
                    Thread.sleep(3000);
                }
            }
            catch(InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.println("ThreadInterrupt ended");
        }

}


public class ThreadExample8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread Started");

        ThreadInterrupt ti = new ThreadInterrupt();
        Thread t = new Thread(ti);
        t.start();
        t.interrupt();  // thread will be interrupted in the blocked/waiting state only



        System.out.println("Main thread ended");
    }
}
