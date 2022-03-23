package com.bjsxt.test.encapsulation.a;

public class Person {
    private int testPrivate = 100;
    int testDefault = 200;
    protected int testProtected = 300;

    public void test(){
        System.out.println(this.testPrivate);
        System.out.println(this.testDefault);
        System.out.println(this.testProtected);
    }


}
