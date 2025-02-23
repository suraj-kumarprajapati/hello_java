package com.filehandlling.io;

import java.io.File;
import java.io.IOException;
import java.io.*;

public class FileWriter01 {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir");
        if(!dir.exists()) {
            dir.mkdir();
        }

        File file1 = new File(dir, "file1.txt");
        if(!file1.exists()) {
            file1.createNewFile();
        }

        // writing in a file


        // create FileWriter object
        // specify in which file, you want to write
        FileWriter fw = new FileWriter(file1, true);  // false -> override the old content, true -> append the new content

        fw.write("Hello");
        fw.write("\n");
        fw.write(new char[] {'W', 'o', 'r', 'l', 'd'});
        fw.write("\n");
        fw.write(65);  // equivalent ascii char -> A
        fw.write("\n");

        System.out.println("Open file1.txt to see the result");

        // compulsorily close the fw resource in order to write in a file
        // if not close, then use flush method to flush the fw buffer into file
        // best approach is to use close() method, flush() method would also work
            fw.flush();
//        fw.close();
    }
}
