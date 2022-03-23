/**
 * 这是一个薪水计算器
 */

package cn.itbaizhan;

import java.util.Scanner;

public class TestXinShui {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("我的年薪计算器");
        System.out.println("exit退出程序；next计算下一个年薪");
        while(true){

            System.out.println("请输入月薪：");
            int monthSalarry = scanner.nextInt();
            System.out.println("请输入一年多少个月薪资：");
            int months = scanner.nextInt();
            int yearSalary = monthSalarry*months;

            System.out.println("请输入命令");
            scanner.nextInt();
            String command = scanner.nextLine();
            System.out.println(command+"==============");
            if("exit".equals(command)){
                System.out.println("退出程序");
                break;
            }
            if("next".equals(command)){
                System.out.println("重新输入新的数据");
                continue;
            }



            if(yearSalary>100000){
                System.out.println("恭喜你，超过了90%的国人");
            }
            if(yearSalary>=200000){
                System.out.println("恭喜你，超过了98%的国人");
            }


            System.out.println("年薪是："+yearSalary);

        }



    }



}
