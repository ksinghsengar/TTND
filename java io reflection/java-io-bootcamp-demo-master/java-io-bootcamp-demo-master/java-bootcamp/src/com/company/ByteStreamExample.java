package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream= null;
        try {
             fileInputStream = new FileInputStream("a.txt");
             fileOutputStream= new FileOutputStream("b.txt");
            int c;
            while((c=fileInputStream.read())!=-1){
                System.out.println(c);
                fileOutputStream.write(c);
            }
        }finally {
                fileInputStream.close();
            fileOutputStream.close();
        }

    }
}
