package com.api.importantapis;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*

    - java 1.5 onwards
    - predefined group of named constant variables
    - by default public static final
    - using enum
    - convention to give uppercase name
    - extending build in class called Enum in java.lang package

*/

enum Week {
    SUN, MON, TUE, WED, THUR, FRI, SAT
}


public class EnumAPI {
    public static void main(String[] args) {
        Week day = Week.MON;
        System.out.println(day);


        int index = Week.MON.ordinal();
        System.out.println(index);

        Week[] weekValues = Week.values();
        for(Week w : weekValues) {
            System.out.println(w + ":" + w.ordinal());
        }
    }
}
