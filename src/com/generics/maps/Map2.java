package com.generics.maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*
    HashTable is synchronized and null values are not allowed
    It is thread safe
    load factor - 0.75


*/




public class Map2 {

    public static void main(String[] args) {
        Map<Integer, String> ht1 = new Hashtable();

        ht1.put(1, "suraj");
        ht1.put(2, "akash");
        // ht1.put(3, null);  // null is now allowed

        System.out.println(ht1);



        // key are in sorted order
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "suraj");
        tm.put(3, "akash");
        tm.put(2, "praveen");

        System.out.println(tm);
    }

}
