package com.bjsxt;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //实例化TreeSet
        Set<String> set = new TreeSet<>();
        //添加元素
        set.add("c");
        set.add("a");
        set.add("d");
        set.add("b");
        set.add("a");

        //获取元素
        for (String str:set){
            System.out.println(str);
        }

        System.out.println("-----------------");
        Set<Users> set1 = new TreeSet<>();
        Users u = new Users("oldlu",18);
        Users u1 = new Users("admin",22);
        Users u2 = new Users("sxt",22);
        set1.add(u);
        set1.add(u1);
        set1.add(u2);
        for (Users users:set1){
            System.out.println(users);

        }
        System.out.println("-------------");
        Set<Student> set2 = new TreeSet<>(new StudentComparator());
        Student s = new Student("oldlu",18);
        Student s1 = new Student("admin",22);
        Student s2 = new Student("sxt",22);
        set2.add(s);
        set2.add(s1);
        set2.add(s2);
        for (Student student:set2){
            System.out.println(student);
        }

    }

}
