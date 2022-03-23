package com.bjsxt.test2;

public class Test22 {
    public static void main(String[]args){
        long d1 = System.currentTimeMillis();
        long result = factorial(5);
        //System.out.printf("%d阶乘的结果:%s%n",10,factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.println("阶乘的结果："+result);
        System.out.println("耗时："+(d2-d1));
        //System.out.printf("递归费时:%s%n",d2-d1);

    }
    /**
     * 求阶乘的方法
     */
    static long factorial(int n){
        if (n==1){      //递归头
            return 1;
        }else {
            return n*factorial(n-1);   //n! = n * (n-1)!
        }
    }





}
