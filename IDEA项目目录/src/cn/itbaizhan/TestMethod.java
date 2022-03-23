package cn.itbaizhan;

/**
 * 测试方法
 */
public class TestMethod {
    /*
    public static void loveU(){
        System.out.println("qwewqeqwewqe");
        System.out.println("我是你爹");
        System.out.println("i am your father");
        System.out.println("520");
    }
    */


    /*
    public static void main(String[] args) {
        for(int i = 0;i<100;i++) {
            loveU();
        }


        }
     */
    public static int add(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }
    public static void main(String[] args) {

        int s=1+add(100,200,300);
        System.out.println(s);

    }

}
