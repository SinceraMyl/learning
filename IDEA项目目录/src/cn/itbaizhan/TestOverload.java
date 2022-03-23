package cn.itbaizhan;

public class TestOverload {

    public static int add(){
        return 0;
    }

    public  static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

        add();
        add(3,4);



    }
}
