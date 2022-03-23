package com.bjsxt.testInterface;

public class SuperMan implements Volant ,Honest{

    @Override
    public void fly() {
        System.out.println("横着飞");
    }

    @Override
    public void stop() {
        System.out.println("竖着停");
    }

    @Override
    public void helpOther() {
        System.out.println("哪里call我，飞哪里！");
    }

    public static void main(String[] args) {
        SuperMan m1 = new SuperMan();
        m1.fly();
        m1.helpOther();
    }


}




















