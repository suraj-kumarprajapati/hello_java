package com.generics.maps;

import java.awt.*;
import java.util.*;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/




/*
    All of them are implementing the Map interface and they store entries (key, value pair) :
    1. HashMap
    2. HashTable
    3. TreeMap
    4. LinkedHashMap
*/





public class Map1 {

    public static void main(String[] args) {
        Map<Integer, String> hm1 = new HashMap<>();

        // in case of hashmap -> null is allowed for both key and value
        // order of insertion is not preserved
        hm1.put(1, "suraj");
        hm1.put(2, "akash");
        hm1.put(null, null);  // allowed
        System.out.println(hm1);


        // iterate over all the keys in hm1
        Set<Integer> set = hm1.keySet();
        Iterator<Integer> iterator = set.iterator();

        System.out.println("All keys in hm1 are : ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        // iterate over all the values in hm1
        Collection<String> values = hm1.values();
        Iterator<String> itr = values.iterator();
        System.out.println("All values in hm1 are : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();


        // iterate over all the entries in hm1
        Set<Map.Entry<Integer, String>> entries = hm1.entrySet();
        Iterator<Map.Entry<Integer, String>> entriesIterator = entries.iterator();
        System.out.println("All the entries in hm1 are : ");
        while(entriesIterator.hasNext()) {
            System.out.print(entriesIterator.next());
        }
        System.out.println();



        // null is allowed both as key and value
        // order of insertion is preserved
        Map<Integer, String> lhm1 = new LinkedHashMap<>();
        lhm1.put(null, null);
        lhm1.put(1, "suraj");
        lhm1.put(2, "akash");
        System.out.println(lhm1);


    }


}
