package com.filehandlling.io;

import java.io.*;

public class File_02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir");  // can also specify the path of existing directory

        // check if dir exists or not
        System.out.println("Does dir exist : " + dir.exists());
        System.out.println("Does dir exist : " + dir.isDirectory());

        // if directory does not exist
        if(!dir.exists()) {
            dir.mkdir();
        }

        // create a file object
        File sampleFile = new File(dir, "sampleFile.txt");  // in order to create a file inside this dir
        sampleFile.createNewFile();

        // check if file exists or not
        System.out.println("Does sampleFile exist : " + sampleFile.exists());
        System.out.println("Does sampleFile exist : " + sampleFile.isFile());


        // check how many files are there in this dir and also print the name of these files
        String files[] = dir.list();  // returns the names of all the files and directories in this dir

        System.out.println("No of files in this dir : " + files.length);
        System.out.println("These files are : " );
        for(String file : files) {
            System.out.println(file);
        }



    }
}
