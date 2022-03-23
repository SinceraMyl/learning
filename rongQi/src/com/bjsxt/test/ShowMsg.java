package com.bjsxt.test;

public class ShowMsg {
    public void showFlag(Generic<? extends Number>generic){
        System.out.println(generic.getFlag());
    }
}
