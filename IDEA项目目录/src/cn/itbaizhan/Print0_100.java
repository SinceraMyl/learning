package cn.itbaizhan;

/**
 * 打印0-130之间的数字，每行显示5个
 */
public class Print0_100 {
    public static void main(String[] args) {
        int i = 0;
        while(i<=130){
            System.out.print(i+"\t");
            if((i+1)%5==0){
                System.out.print("\n");
            }
            i++;
        }

    }
}
