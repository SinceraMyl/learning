package com.bjsxt.test;

public class Test02 {
    public static void main(String[] args) {
        IgenericImpl igeneric = new IgenericImpl();
        String name = igeneric.getName("oldlu");
        System.out.println(name);

        Igeneric<String> igeneric1 = new IgenericImpl();
        String name1 = igeneric1.getName("bjsxt");
        System.out.println(name1    );

    }
}
