
public class SxtStu {
    //属性
    int id;
    String sname;
    int age;
    //方法
    void study(){
        System.out.println("我正在学习");


    }
    //构造方法(方法名和类名保持一致！)
    SxtStu(){
    }
    public static void main(String[] args) {
        SxtStu s1 = new SxtStu();
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id = 10002;
        s1.sname = "qwew";
        System.out.println(s1.id);
        System.out.println(s1.sname);
        System.out.println("===========");
        s1.study();


    }





}
