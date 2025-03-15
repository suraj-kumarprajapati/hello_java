package com.error.handlling;


/*

    ducking the exception

 */

public class ErrorHandling_03 {
    public static void main(String[] args) {
        try {
            calc();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void calc() throws Exception {
        int a = 5;
        int b = 0;
        int res = 0;

        res = a / b;
        System.out.println("Result is : " + res);
    }
}
