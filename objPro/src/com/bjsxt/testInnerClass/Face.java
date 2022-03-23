package com.bjsxt.testInnerClass;

public class Face {

    private String shape = "国字脸";

    class Nose{
        private String shape = "高鼻梁";

        public void breath(){
            System.out.println("鼻子长在了"+Face.this.shape+"形状的脸上");
            System.out.println("呼吸，呼吸，呼吸！");
        }
    }

    class Ear{

    }

    class Eye{

    }

    public static void main(String[]args){
        Face.Nose nose = new Face().new Nose();
        nose.breath();

    }




}
