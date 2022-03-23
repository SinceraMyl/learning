package cn.qxxss.juittest;

/**
 * 
 */
public class Student {
    String name;
    Student friend;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.friend = s2;
        s2.friend = s1;
        s1 = null;
        s2 = null;
        System.out.println(s1.friend);

    }
}
