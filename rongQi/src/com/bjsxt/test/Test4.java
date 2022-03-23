package com.bjsxt.test;

public class Test4 {
    public static void main(String[] args) {
        MethodGeneric.setFlag("oldlu");
        MethodGeneric.setFlag(123123);

        String flag = MethodGeneric.getFlag("bjsxt");
        System.out.println(flag);
        Integer flag1 = MethodGeneric.getFlag(123123);
        System.out.println(flag1);

    }
}
