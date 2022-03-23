package com.bjsxt.Super;

public class TestSuper01 {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass{
    public int value;
    public void f(){
        value = 100;
        System.out.println("FatherClass.value="+value);
    }
}

class ChildClass extends FatherClass{
    public int value;

    public void f(){
        super.f();//调用父类的普通方法
        value = 200;
        System.out.println("ChildClass.value="+value);
        System.out.println(value);
        System.out.println(super.value);//调用父类的成员变量

    }
    
}