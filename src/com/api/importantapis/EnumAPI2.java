package com.api.importantapis;

/**************************************
 Developer Name : Suraj Prajapati
 Developer Contact : sp0640481@gmail.com
 Created On :
 Project Name :
 ***************************************/

enum Result {
    // behind the scenes
    // -> public static final Result PASS = new Result()
    // -> public static final Result FAIL = new Result()
    // -> public static final Result NR = new Result()

    PASS, FAIL, NR;

    Result() {
        System.out.println("Inside enum constructor");
    }


    int marks;

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return this.marks;
    }
}


public class EnumAPI2 {

    public static void main(String[] args) {
        Result.PASS.setMarks(90);  // setting the marks only for PASS
        int m = Result.PASS.getMarks();
        System.out.println(m);  // 90

        int m2 = Result.FAIL.getMarks();
        System.out.println(m2);  // 0


        Result res = Result.PASS;

        switch (res) {
            case PASS :
                System.out.println("passed");
                break;
            case FAIL:
                System.out.println("failed");
                break;
            case NR:
                System.out.println("no result");
                break;
            default:
                System.out.println("didn't appear in the exam");
        }
    }

}
