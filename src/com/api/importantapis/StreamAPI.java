package com.api.importantapis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*

    - whenever we want to process the collection data without affecting/modifying the collection itself,
      we implement stream
    - from java 8 onwards

*/


public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 4, 3, 5);

        Stream<Integer> stream = list.stream();
//        stream.forEach((num) -> System.out.println(num));

        Stream<Integer> sortedStream = stream.sorted();
        Stream<Integer> evenStream = sortedStream.filter(x -> x%2==0);
        Stream<Integer> mapStream = evenStream.map(x -> x*2);
        mapStream.forEach(x -> System.out.println(x));



        Stream<Integer> finalStream = list.stream().sorted().filter(x->x%2==0).map(x->x*2);
        finalStream.forEach((x) -> System.out.println(x));


        /*

        // it will give error because, stream can be operated only once
        stream.forEach((num) -> System.out.println(num));

         */


    }
}
