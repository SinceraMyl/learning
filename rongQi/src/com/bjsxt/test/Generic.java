package com.bjsxt.test;

public class Generic <T>{
    private T flag;

    public void setFlag(T flag){
        this.flag = flag;
    }

    public T getFlag(){
        return this.flag;
    }
}
