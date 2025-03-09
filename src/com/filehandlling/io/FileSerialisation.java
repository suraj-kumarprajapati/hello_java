package com.filehandlling.io;

import java.io.*;


// Serializable -> It is a marker interface (meaning no need to implement any method for this interface)
// transient -> helps in selective serialisation
class Cricketer implements Serializable {
    private String name;
    transient private int age;  // will not participate in serialisation/deserialisation
    private int runs;

    public Cricketer(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class FileSerialisation  {
    public static void main(String[] args) throws Exception {



        // 1. Serialisation

        Cricketer c = new Cricketer("Sachin", 44, 30000);

        FileOutputStream fos = new FileOutputStream("file1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);  // to make the process faster and efficient
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(c);

        oos.flush();
        oos.close();


        // 2. Deserialisation

        FileInputStream fis = new FileInputStream("file1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer cr = (Cricketer) ois.readObject();
        cr.display();

        ois.close();
    }
}
