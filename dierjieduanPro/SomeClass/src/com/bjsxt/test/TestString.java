package com.bjsxt.test;

public class TestString {
    public static void main(String[] args) {
        String str = "aabb";        //不可变字符序列
        StringBuilder sb = null;    //可变字符序列，线程不安全，效率高
        StringBuffer sb2 = null;    //可变字符序列，线程安全，效率低

        sb = new StringBuilder("gao");

        sb.append(123);
        sb.append(456);
        System.out.println(sb);
        sb.append("aa").append("bb").append("cc");

        for (int i=0;i<10;i++){
            sb.append(i);
        }
        System.out.println(sb);






    }
}
