package cn.itbz;

public class TestDigui {

    /**
     * 测试递归
     *
     */

    public static void a(){
        System.out.println("调用一次方法A");
        a();
    }

    //递归计算阶乘
    public static long diGui(int n){
        if (n==1||n==0){
            return 1;
        }else {
            return n*diGui(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(diGui(10));
        
    }


}
