package com.interfaces.lambdaexpressions;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*

    why to use lambda expression ?
    - to provide the implementation of functional interface (anonymous interface)

* */


@FunctionalInterface
interface Book {
    public int getPageCount();
}

public class LambdaExpression {
    public static void main(String[] args) {

        /*

        Book book = new Book() {
            @Override
            public int getPageCount() {
                return 0;
            }
        };

         */




        // lambda expression for functional interface
        Book book = () -> 0;
        int pageCount = book.getPageCount();

        System.out.println(pageCount);


    }
}

