package com.bjsxt;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        //实例化Vector
        Vector<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("a");

        for (int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }

        System.out.println("--------------");

        for (String str:v){
            System.out.println(str);
        }
        



    }

}
