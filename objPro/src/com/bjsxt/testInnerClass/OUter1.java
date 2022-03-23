package com.bjsxt.testInnerClass;

//外部类
class Outer1 {
    private int age = 10;

    private void show(){
        System.out.println("要你好看！");
    }

    //内部类
    public class Inner1{
        private String name = "tom";
        private int age = 20;

        public void showInner(){
            System.out.println("Inner.showInner");
            System.out.println(age);
            System.out.println(Outer1.this.age); //当外部类属性和内部类属性发生重名时，可以通过：Outer1.this.成员名
            show();   //内部类可以直接使用外部类的成员

        }
    }

    public static void main(String[] args) {
        Outer1.Inner1 inn01 = new Outer1().new Inner1();
        inn01.showInner();

        Outer1 out02 = new Outer1();
        Inner1 inn02 = out02.new Inner1();
        inn02.showInner();

    }








}


