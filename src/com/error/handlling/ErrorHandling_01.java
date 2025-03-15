package com.error.handlling;

/*
*
* We can categorize error into 3 types :
* 1. Syntax Error
* 2. Logical Error
* 3. Runtime Error  or exceptions
*
* */

public class ErrorHandling_01 {
    public static void main(String[] args) {
        // normal statement
        int num1 = 6;
        int num2 = 2;
        int res = 0;

        int[] nums = {1, 2, 3, 4, 5};

        try {
            // critical statement 1
            res = num1 / num2;
            System.out.println("result is : " + res);

            // critical statement 2
            System.out.println(nums[9]);
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Bye...");
    }
}
