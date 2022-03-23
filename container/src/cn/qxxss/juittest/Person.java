package cn.qxxss.juittest;

public class Person {
    String name;
    int age;

    public void show() {
        System.out.println(name);

    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 24;
        p1.show();
        Person p2  = new Person();
        p2.name = "李四";
        p2.age=25;
        p2.show();
        Person p3 = new Person();
        p3 = p1;
        Person p4 = new Person();
        p4 = p1;
        p4.age = 80;
        Person p5 = p1;
        System.out.println(p1.age);
    }

}
