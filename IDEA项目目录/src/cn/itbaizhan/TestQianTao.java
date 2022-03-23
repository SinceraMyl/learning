package cn.itbaizhan;

/**
 * 测试嵌套循环
 */
public class TestQianTao {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=0;j<5;j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }

}

