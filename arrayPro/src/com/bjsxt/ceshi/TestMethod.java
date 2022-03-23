package com.bjsxt.ceshi;

public class TestMethod {

    public static void main(String[] args) {

        /**
         * 输入：迟到时间，月薪
         * 迟到1-10分钟警告
         * 11-20分钟罚款100
         * 21-30分钟罚款200
         * 30分钟以上扣除半日工资
         * 迟到一小时按旷工计算扣除3日工资
         * 输出罚款金额
         */

        chidao(61,170000);


    }

    public static int chidao(int time,int salary){
        int fakuan = 0;

        System.out.println("fakuan:"+fakuan);
        if ( time <=10){
            System.out.println("jinggao");

        }else if (time<=20){
            System.out.println("chidao:"+time);
            fakuan = 100;


        }else if (time<=30){
            System.out.println("chidao:"+time);
            fakuan = 200;


        }else if (time>30&time<=60){
            System.out.println("chidao:"+time);
            fakuan = salary/30/2;


        }else if (time>60){
            System.out.println("chidao:"+time);
            fakuan = (salary/30)*3;
      
        }

        return fakuan;
    }

}
