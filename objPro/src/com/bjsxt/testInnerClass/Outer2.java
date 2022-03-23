package com.bjsxt.testInnerClass;

/*
测试静态内部类
 */
class Outer2 {
    private int a = 10;
    private static int b = 20;

    //相当于外部类的一个静态成员
    static class Inner2{
        public void test(){
        //    System.out.println(a); //静态内部类不能访问外部类的普通属性
            System.out.println(b);//静态内部类可以访问外部类的静态属性
        }

    }

}

class TestStaticInnerClass{
    public static void main(String[]args){
        //通过new外部类名.内部类名（）来创建内部类对象
        Outer2.Inner2 inner = new Outer2.Inner2();
        inner.test();
    }
}
