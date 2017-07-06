package com.company;


import java.io.*;
import java.nio.file.Files;

public class DirectoryExample {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("temp2");
//        file.mkdir();
//        file.renameTo(new File("temp2"));
        System.out.println(file.delete());


    }
}
