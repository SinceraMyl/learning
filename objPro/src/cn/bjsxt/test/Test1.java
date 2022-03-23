package cn.bjsxt.test;//位于类的第一句，非注释的第一句

//import com.bjsxt.test2.User;
import com.bjsxt.test2.*;
import  java.sql.Date;
import java.util.*;
import static com.bjsxt.test2.Student.school;


public class Test1 {

    public static void main(String[] args) {
        //com.bjsxt.test2.User u = new com.bjsxt.test2.User();
        User u = new User();
        u.login();
        Student s = new Student();

        java.util.Date d = new java.util.Date();
    }
}
