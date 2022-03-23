package com.bjsxt.array;

/**
 * 使用javabean和数组存储表格的信息。
 * 非常重要！！！！
 */


public class Test05 {
    public static void main(String[] args) {

        //ORM Object relationship mapping 对象关系映射
        Emp emp0 = new Emp(1001,"高效益",18,"程序员","2019-9-9");
        Emp emp1 = new Emp(1002,"高效er",19,"程序员","2019-3-9");
        Emp emp2 = new Emp(1003,"高效san",20,"程序员","2019-4-9");

        //Emp[] emps = {emp0,emp1,emp2};
        Emp[] emps = new Emp[3];
        emps[0] = emp0;
        emps[1] = emp1;
        emps[2] = emp2;

        //遍历
        for (int i=0;i< emps.length;i++){
            System.out.println(emps[i]);
        }
         int b=1;
        b = 2;
        System.out.println(b);

    }

}

class Emp{
    private int id;
    private String name;
    private int age;
    private String job;
    private String hiredate;

    public Emp(int id, String name, int age, String job, String hiredate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return getId()+"\t"+getName()+"\t"+getAge()+"\t"+getJob()+"\t"+getHiredate();
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

    public String getAge() {
        return age+"岁";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}