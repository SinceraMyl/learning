package com.bjsxt.ceshi;



public class DiGui {

    public static int diGui(int s){
        if (s==1){
            return 1;
        }else {
            return s*diGui(s-1);
        }


    }

    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();

        long endtime = System.currentTimeMillis();

        System.out.println("time:"+(endtime-starttime));
        System.out.println("/u0000");
        int i = 0;
        i++;
        System.out.println(i);
    }


}
