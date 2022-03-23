package com.bjsxt.test.encapsulation.b;

import com.bjsxt.test.encapsulation.a.Person;

public class Teacher extends Person{

    public void test(){
        System.out.println(super.testProtected);
    }

    public static void main(String[] args) {
        Person p = new Person();
        // System.out.println(p.test);
        // System.out.println(p.testProtected);

    }

}
