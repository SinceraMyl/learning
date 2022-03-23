package com.bjsxt.test;

/**
 * 测试调试功能
 */
public class Tesr05 {

    private int num = 10;

    public void run(int a){
        num = num*a;
        go(num);
    }

    public void go(int b){
        System.out.println("Tesr05.go");
        System.out.println("num="+b);
    }

    public static void main(String[] args) {
        Tesr05 t = new Tesr05();
        t.run(3);
    }

}
