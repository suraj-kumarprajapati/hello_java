package com.interfaces.lambdaexpressions;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/



/*


    Difference between abstract class and interface :

        abstract class
        - normal methods as well as abstract
        - partial implementation
        - constructor is allowed
        - variables need not be public static final
        - no restriction on methods modifiers
        - use extends, (multiple inheritance not possible)

        interface
        - no implementation
        - methods are public and abstract
        - we can't add modifiers like private, protected, final, static, synchronized, native, strictfp, etc.
        - every variable is public static and final
        - no constructor
        - use implements, (multiple inheritance allowed with implements keyword)


        common -
        - can not create object of either abstract class or interface



  */


interface Computer {
    public void compile();
}

class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("You got 5 errors");
    }
}

class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("You got 5 errors, faster");
    }
}

class Developer {
    public void buildApp(Computer obj) {
        System.out.println("Building app...");
        obj.compile();
    }
}



public class InterfaceEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer();
//        developer.buildApp(new Desktop());
        developer.buildApp(new Laptop());
    }

}
