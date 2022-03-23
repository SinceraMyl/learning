package com.bjsxt.abstractClass;

public class Test {
    public static void main(String[] args) {
        // Student s = new Student("add"); //抽象类不能 创建对象
        Student s = new SxtStu();
        s.study();
        s.exam();

    }
}

class SxtStu extends Student{
    public void study(){
        System.out.println("好好学习，天天向上");
    }

    public void exam(){
        System.out.println("考个100分");
    }
}



