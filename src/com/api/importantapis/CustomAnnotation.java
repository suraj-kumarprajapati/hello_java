package com.api.importantapis;

import java.lang.annotation.*;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

/*

    Annotation -> annotation is a way to maintain some information/to add metadata about the class, method, field, parameter, etc. to provide some extra info.
    - Built in annotations
    - Custom annotations
 */


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
    String country() default "India";
    int age() default 18;
}



@CricketPlayer(country = "India", age=35)
 class Virat {
     private int innings;
     private int runs;

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}

public class CustomAnnotation {
    public static void main(String[] args) {
        Virat v = new Virat();
        v.setInnings(1000);
        v.setRuns(10000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c = v.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);
        CricketPlayer ca = (CricketPlayer) a;
        System.out.println(ca.age());
        System.out.println(ca.country());

    }
}
