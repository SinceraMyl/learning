package com.bjsxt.testInnerClass;

//测试匿名内部类

public class TestAnonymousInnerClass {

    public void test(A a){
        a.run();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass tai = new TestAnonymousInnerClass();
        //tai.test(new AA());
        tai.test(new A() {
            @Override
            public void run() {
                System.out.println("TestAnonyMousInnerClass.run1111");
            }
        });

        tai.test(new A() {
            @Override
            public void run() {
                System.out.println("TestAnonyMousInnerClass.run22222");
            }
        });

    }

}

//有名字的类，可以反复使用
class AA implements A{

    @Override
    public void run() {
        System.out.println("AA.run");

    }
}

interface A{
    void run();
}
