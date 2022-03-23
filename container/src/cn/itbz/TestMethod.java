package cn.itbz;

public class TestMethod {
    /*
    定义 一个 方法
     */
    public static  void loveU(){
        System.out.println("520");

    }

    public static int add(int a,int b,int c){
        int  sum = a+b+c;
        return sum;
    }



    public static void main(String[] args) {
        int  count = 0;
        for (int i=0;i<100;i++){
            loveU();
            count++;
        }
        System.out.println(count);
        int q=add(100,200,150);
        System.out.println(q);


    }
}
