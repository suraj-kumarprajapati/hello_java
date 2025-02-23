package com.filehandlling.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferReader01 {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir");
        if(!dir.exists()) {
            dir.mkdir();
        }

        File file2 = new File(dir, "file2.txt");
        if(!file2.exists()) {
            file2.createNewFile();
        }

        FileReader fr = new FileReader(file2);
        BufferedReader br = new BufferedReader(fr);

        // read content line by line
        String line = br.readLine();
        while(line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        System.out.println();

        br.close();
        fr.close();

    }
}
