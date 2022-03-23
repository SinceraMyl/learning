package cn.bjsxt.test.inherit;

public class Person extends Object{
    String name;
    int height;

    public void rest(){
        System.out.println("休息");
    }

    public Person getFriend(){
        return new Person();
    }

    public String toString(){
        return "名字是："+name+"，身高："+height;
    }

    public static void main(String[] args) {
        Student s = new Student("张三",180,90);
        s.rest();
        System.out.println(s instanceof Person);
        System.out.println(s.toString());

    }
}

class Student extends Person{
    int score;

    public void study(){
        System.out.println("学习"+this.name);
    }

    public void rest(){
        System.out.println("回宿舍！");
    }

    Student(String name,int height,int score){
        this.name = name;
        this.height = height;
        this.score = score;
        
    }

}

class Employee extends Person{

    public void rest(){
        System.out.println("办公区休息");
    }

}

class Teacher{
    int teacherId;

    Person person = new Person();

    Teacher(int teacherId,String name,int height){
        this.teacherId = teacherId;
        this.person.name = name;
        this.person.height = height;

    }
}














