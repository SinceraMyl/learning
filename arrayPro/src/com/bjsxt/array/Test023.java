package com.bjsxt.array;

public class Test023 {

    public static void main(String[] args) {

        Man m = new Man (10,"高效");

        //静态初始化需要在声明后 直接初始化
        Man[] mans =
         {new Man(10,"朱桐"),
                 new Man(20,"朱桐1")};

        for (int i=0;i<mans.length;i++){
            System.out.println(mans[i].getName());
        }
        //增强for循环（读取元素的值）
        for(Man man:mans){
            System.out.println(man);
        }



    }
}

class Man{
    private int id;
    private String name;

    public Man(){

    }

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id:"+id+",name:"+this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}