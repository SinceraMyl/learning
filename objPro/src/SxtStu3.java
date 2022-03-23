
public class SxtStu3 {

    int id;
    String sname;
    int age;

    SxtStu3(){ //无参构造器。没有手动定义构造器，系统会自动添加

    }

    SxtStu3(int id){
        System.out.println(id);
        this.id = id;
    }

    SxtStu3(int id,String sname,int age){
        this.id = id;
        this.sname = sname;
        this.age = age;
    }

    public static void main(String[] args) {
        SxtStu3 s = new SxtStu3(1001,"qeweqe",18);
    //    s.id = 1001;
    //    s.sname = "qeweqe";
    //    s.age = 18;


    }


}
