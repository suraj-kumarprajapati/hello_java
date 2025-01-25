package com.api.importantapis;

import java.time.*;


/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/


/*

    This api was created by joda.org :
        - no constructor is required to invoke date and time apis
        - LocalDate, LocalTime, etc...


*/


public class JodaDateAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);  // prints only time

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        System.out.println(day + "/" + month + "/" + year);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nanoSecond = time.getNano();
        System.out.println(hour + ":" + minute + ":" + second + ":" + nanoSecond);


    }
}
