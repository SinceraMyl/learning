package com.bjsxt.polymophism;

public class Animal {

    public void shout(){
        System.out.println("叫了一声！");
    }

}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪汪！");
    }

    public void seeDoor(){
        System.out.println("看门！");
    }

}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵喵喵！");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

class Mouse extends Animal{

}


















