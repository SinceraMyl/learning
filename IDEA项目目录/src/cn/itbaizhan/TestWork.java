package cn.itbaizhan;

/**
 * 计算1-100的总和，奇数和，偶数和
 */
public class TestWork {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int sumOdd = 0;
        int sumOushu = 0;
        while (i<=100){
            sum+=i;

            if(i%2==0){
                sumOushu+=i;
            }else{
                sumOdd+=i;
            }
            i++;


        }
        System.out.println(sumOdd);
        System.out.println(sumOushu);
        System.out.println(sum);
        System.out.println("--------------------");


        int r = 0;


        while (r<=120){

            if(r%5==0){
                System.out.println(r);
            }



            r++;
        }








    }
}
