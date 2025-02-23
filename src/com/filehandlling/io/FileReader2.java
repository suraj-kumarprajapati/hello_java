package com.filehandlling.io;

import java.io.*;

public class FileReader2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir");
        if(!dir.exists()) {
            dir.mkdir();
        }

        File file1 = new File(dir, "file1.txt");
        if(!file1.exists()) {
            file1.createNewFile();
        }


        char[] data = new char[(int) file1.length()];

        // reading from a file
        // specify the path
        FileReader fr = new FileReader(file1);

        // read the contents of file and store in data array
        fr.read(data);

        // print the data
        for(char ch : data) {
            System.out.print(ch);
        }
    }
}
