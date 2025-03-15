package com.error.handlling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        try{
            System.out.println("Enter a number : ");
            num = sc.nextInt();
        }
        catch(InputMismatchException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
            System.out.println("Resources closed");
        }


        // if no catch block then we can use try with resources block
        /*

            // automatically closes the resources
            try(Scanner sc = new Scanner(System.in)) {
                int num = sc.nextInt();
            }


         */
    }
}
