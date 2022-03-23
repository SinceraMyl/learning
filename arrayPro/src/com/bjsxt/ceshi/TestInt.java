package com.bjsxt.ceshi;

public class TestInt {
    public static void main(String[] args) {
        /*
        int  a  = 10;
        int b = 015;
        int c = 0xff;
        int d = 0b101001;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("pi");
        */
        float f1 = 0.1F;
        double d1 = 1/10;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(f1==d1);

        float f2 = 23434343434343F;
        float f3 = f2+1;
        System.out.println(f2==f3);

        boolean q1 = false;
        boolean q2 = false;
        if (q1){
            System.out.println("q1是true");
        }else {
            System.out.println("q1是false");
        }

        int w1 = 3;
        int w2 = 4;
        System.out.println(w1+w2);
        System.out.println(w1+"w2");

        int g=10;

        int s = g;
        System.out.println(s);

    }
}
