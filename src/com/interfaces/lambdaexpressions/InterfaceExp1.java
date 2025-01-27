package com.interfaces.lambdaexpressions;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*

    Interface
    -> contains only abstract methods
    -> It can not be instantiated
    -> variables are public static final
    -> all methods are public and abstract
    -> no constructor
    -> one class can implement many interfaces

* */

interface A {
    // by default all variables are public static final, so initialization is must
    int a=0;

    // by default all methods are public and abstract
    void show();
}

interface C {
    void abc();
}

class B implements A, C {

    @Override
    public void show() {
        System.out.println("Inside show method implemented by class B of interface A");
    }


    @Override
    public void abc() {
        System.out.println("Inside abc method implemented by class B of interface C");
    }
}

public class InterfaceExp1 {
    public static void main(String[] args) {
        System.out.println(A.a);

        /*

        A.a = 10;  // error, because final field can not be modified

        */


        A obj = new B();
        obj.show();

        /*

        obj.abc();  // error, because reference type if A, it should be B to invoke both methods

         */

    }
}
