package com.company;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Peter";
        e.address = "New York";
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("employee_out.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /employee_out.txt");
        }catch(IOException i) {
            i.printStackTrace();
        }
    }
}
