package com.filehandlling.io;

import java.io.*;

public class FileReader1 {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir");
        if(!dir.exists()) {
            dir.mkdir();
        }

        File file1 = new File(dir, "file1.txt");
        if(!file1.exists()) {
            file1.createNewFile();
        }


        // reading from a file
        // specify the path
        FileReader fr = new FileReader(file1);

        // returns the integer value of the first character
        int ch = fr.read();

        // -1 indicates end of the file
        while(ch != -1) {
            System.out.print((char) ch);  // typecast it to char
            ch = fr.read();
        }



    }
}
