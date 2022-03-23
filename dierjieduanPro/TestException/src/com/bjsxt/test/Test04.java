package com.bjsxt.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {

            try(FileReader reader = new FileReader("d:/a.txt");) {
                char c = (char) reader.read();
                char c2 = (char) reader.read();
                System.out.println("" + c + c2);
            }catch (Exception e){
                e.printStackTrace();
            }



    }
}
