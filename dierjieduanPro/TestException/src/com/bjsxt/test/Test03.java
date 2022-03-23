package com.bjsxt.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws Exception{
        readFile("d/a.txt");


    }

    public static void readFile(String path) throws Exception{
        FileReader reader = null;
        try {
            reader = new FileReader("d:/a.txt");
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println(""+c+c2);
        }finally {
            try {
                if (reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
