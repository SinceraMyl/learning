package com.bjsxt.test;

public class Test03 {
    public static void main(String[] args) {
        MethodGeneric methodGeneric = new MethodGeneric();
        methodGeneric.setName("oldlu");
        methodGeneric.setName(123123);

        MethodGeneric methodGeneric1 = new MethodGeneric();
        String name = methodGeneric1.getName("BJSxt");
        Integer name1 = methodGeneric1.getName(123);
        System.out.println(name);

    }
}
