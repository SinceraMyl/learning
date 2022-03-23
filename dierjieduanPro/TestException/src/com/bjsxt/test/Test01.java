package com.bjsxt.test;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("step1");
        try{
            int i = 1/0;   //运行时异常
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("step2");

        File f = new File("D:/a.txt");
        try{
            f.createNewFile();  //编译时异常
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
