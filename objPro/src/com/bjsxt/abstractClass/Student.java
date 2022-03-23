package com.bjsxt.abstractClass;

public abstract class Student {

    private String  name;

    abstract public void study();
    abstract public void  exam();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //构造方法
    public Student(String name) {
        this.name = name;
    }

    //无参构造方法
    Student(){

    }
}



