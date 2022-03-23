package cn.itbaizhan;

/**
 * 测试循环
 */
public class TestWhile {
    public static void main(String[] args) {
        int a= 1;
        while(a<=3) {

            System.out.println("i love you"+a);
            a++;
        }
        int b=0;
        int sum=0;
        while (b<=100){
            sum= sum + b;
            b++;
        }
        System.out.println("sum="+sum);


        int p=0;
        int num=0;
        while(p<=100){
            num+=p;
            p++;
        }
        System.out.println("结果为"+num);



    }
}
