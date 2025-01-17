package com.threads.multithreading;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*
  Deadlock -> when two or more threads are in blocked state due to mutual dependency
 */



class ThreadDL implements Runnable {

    String res1 = new String("java");
    String res2 = new String("sql");
    String res3 = new String("dsa");

    public void run() {

        // if student-1 acquires the resource
        if(Thread.currentThread().getName().equals("Student-1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Student-1 has acc " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("Student-2 has acc " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("Student-1 has acc " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e) {
                System.out.println("Some Problem....");
            }

        }
        // if student-2 acquires the resource
        else {
            try {
                Thread.sleep(3000);
                synchronized (res3) {
                    System.out.println("Student-2 has acc " + res3);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("Student-2 has acc " + res2);
                        Thread.sleep(3000);
                        synchronized (res1) {
                            System.out.println("Student-2 has acc " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e) {
                System.out.println("Some Problem....");
            }
        }
    }

}






public class ThreadExample10 {

    public static void main(String[] args) {
        System.out.println("Inside Main Thread");

        ThreadDL tdl = new ThreadDL();
        Thread t1 = new Thread(tdl);
        t1.setName("Student-1");
        Thread t2 = new Thread(tdl);
        t2.setName("Student-2");

        t1.start();
        t2.start();

        System.out.println("Main Thread Ended");
    }



}
