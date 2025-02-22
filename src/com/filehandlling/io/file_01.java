package com.filehandlling.io;

import java.io.*;

public class file_01 {
    public static void main(String[] args) throws IOException {
        // creating a file object
        File file1 = new File("file1.txt");
        System.out.println("Does file1 exist : " + file1.exists());  // false

        file1.createNewFile();
        System.out.println("Does file1 exist : " + file1.exists());  // true



        // creating directory
        File dir = new File("dir");
        System.out.println("Does dir exist : " + dir.exists());  // false

        dir.mkdir(); // crate a new directory
        System.out.println("Does dir exist : " + dir.exists());   // true


    }
}
