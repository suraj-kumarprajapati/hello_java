package com.interfaces.lambdaexpressions;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/


class A1 {
    public  void show() {
        System.out.println("inside show method of A1");
    }

    // 1. member class of A1
    class B1 {
        public void display() {
            System.out.println("inside display method of B1");
        }
    }

    // 2. static class
    static class C1 {
        public void display() {
            System.out.println("inside display method of C1");
        }
    }

    // 3. anonymous inner class
}


public class InnerClass01 {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();

        A1.B1 objB = obj.new B1();
        objB.display();

        A1.C1 objC = new A1.C1();
        objC.display();
    }
}
