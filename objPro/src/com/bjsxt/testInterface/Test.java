package com.bjsxt.testInterface;


/**
 * 测试静态方法
 */
public class Test {
    public static void main(String[]args){

    }
}

interface A{
    public static void staticMethod(){
        System.out.println("A.staticMethod");
    }
}

class Test_A implements A{
    public static void staticMethod(){
        System.out.println("Test_A.staticMethod");
    }
}