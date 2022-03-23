package cn.itbaizhan;

public class TestIf02 {
    public static void main(String[] args) {
        double r = Math.random()*4;
        double area = Math.PI*r*r;
        double circle = 2*Math.PI*r;

        if(area>=circle){
            System.out.println("面机大于等于周长");
        }else{
            System.out.println("面积的数值小于周长");
        }
    }
}
