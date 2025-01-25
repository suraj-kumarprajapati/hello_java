package com.api.importantapis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/


/*
    From java 8 onwards ----
 */


public class LaunchForEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);

        // for each loop
        for(Integer num : list) {
            System.out.println(num);
        }
        System.out.println("____________________________");

        // for each method


//        list.forEach( num -> System.out.println(num)  );

        // implement the consumer functional interface -> which has only one abstract method
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        list.forEach(con);
    }
}
