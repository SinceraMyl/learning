package com.bjsxt.test.encapsulation.a;

public class Student extends Person{
    public static void main(String[] args) {
        Person p = new Person();
        //p.testPrivate;
        System.out.println(p.testDefault);
        System.out.println(p.testProtected);
    }

}
