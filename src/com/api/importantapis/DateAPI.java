package com.api.importantapis;


/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/


/*

    Two dates :
        1. java.util.Date
        2. java.sql.Date

* */


public class DateAPI {


    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);  // prints present's date with time, zone, day, etc.


        long dateInSec = dt.getTime();
        System.out.println(dateInSec);  // prints time in ms



        java.sql.Date dt2 = new java.sql.Date(dateInSec);
        System.out.println(dt2);  // prints only date
    }


}
