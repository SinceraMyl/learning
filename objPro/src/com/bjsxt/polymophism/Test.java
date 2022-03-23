package com.bjsxt.polymophism;

public class Test {

    static void animalCry(Animal a){
        a.shout();       //多态！！！
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        animalCry(d);
        animalCry(new  Cat());
        //测试类型的转换
        Animal a = new Dog();  //向上类型转换，自动的

        Dog d2 = (Dog) a ;
        d2.seeDoor();

       // Cat c3 = (Cat) a;
       // c3.catchMouse();

        if(a instanceof Dog){
            Dog d3=(Dog)a;
            d3.seeDoor();
        }else if(a instanceof Cat){
            Cat c4 = (Cat)a;
            c4.catchMouse();
        }

    }






}
