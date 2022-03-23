package cn.itbaizhan;

/**
 * 测试if语句
 */
public class TestIf01 {
    public static void main(String[]args){
        double d = Math.random();//生成[0,1）随机数
        int a = 1+(int)(Math.random()*6);

        System.out.println(a);
        if(a<3){
            System.out.println("小");

        }else {
            System.out.println("大");
        }


    }
}
