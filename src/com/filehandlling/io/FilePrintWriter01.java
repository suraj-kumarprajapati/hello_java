package com.filehandlling.io;

import java.io.*;


/*

 With the help of PrintWriter we can write data of any type -> int, long, float, double, char, boolean, String, char[], etc.

 */

public class FilePrintWriter01 {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir");
        if(!dir.exists()) {
            dir.mkdir();
        }

        File file2 = new File(dir, "file2.txt");
        if(!file2.exists()) {
            file2.createNewFile();
        }

        FileWriter fw = new FileWriter(file2);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);  // writes 'a'  -> old method
        pw.write("\n");

        // new method
        pw.println("hello");
        pw.println(97);
        pw.println(new char[] {'W', 'o', 'r', 'l', 'd'});
        pw.println(true);
        pw.println((long) 97);
        pw.println(100.00);
        pw.print(" end .....");

        pw.close();

        System.out.println("Open file to see the result");

    }
}
