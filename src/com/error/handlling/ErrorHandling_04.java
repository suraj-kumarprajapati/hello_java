package com.error.handlling;

class CustomException extends Exception {
    public CustomException() {

    }

    public  CustomException(String msg) {
        super(msg);
    }
}

public class ErrorHandling_04 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = -4;
        int res = 0;

        try {
            if(num2 < 0) {
                throw new CustomException("num2 is a negative number");
            }

            res = num1 / num2;
            System.out.println("Result is : " + res);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
