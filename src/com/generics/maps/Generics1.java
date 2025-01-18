package com.generics.maps;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

class GenClass<T> {
    private T obj;

    GenClass(T obj) {
        this.obj = obj;
    }

    public void printType() {
        System.out.println("Type of obj is : " + this.obj.getClass().getName());
    }

    public T getObj() {
        return this.obj;
    }
}


public class Generics1 {
    public static void main(String[] args) {
        GenClass<String> genObj1 = new GenClass<String>("Suraj");
        genObj1.printType();
        System.out.println(genObj1.getObj());

        GenClass<Integer> genObj2 = new GenClass<Integer>(10);
        genObj2.printType();
        System.out.println(genObj2.getObj());
    }
}
