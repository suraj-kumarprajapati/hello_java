package com.filehandlling.io;

import java.io.*;

public class FileBufferWriter01 {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir");
        if(!dir.exists()) {
            dir.mkdir();
        }

        File file2 = new File(dir, "file2.txt");
        if(!file2.exists()) {
            file2.createNewFile();
        }

        // alongside FileWriter we can use BufferedWriter to make the process even faster
        FileWriter fw = new FileWriter(file2, true);  // true -> append, false -> override
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello");
        bw.newLine();
        bw.write(new char[] {'W', 'o', 'r', 'l', 'd'});
        bw.newLine();

        // flush and close the resources
        bw.flush();
        bw.close();

        System.out.println("Open file2.txt to see the result");
    }
}
