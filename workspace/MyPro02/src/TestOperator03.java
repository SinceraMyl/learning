/**
 * 逻辑运算符
 * @author 朱桐的性能怪兽
 *
 */
public class TestOperator03 {
	public static void main(String[]args) {
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);
		System.out.println(!b2);
		//短路 
		// int c = 3/0;
		boolean b3=1>2&&2<(3/0);//短路与
		System.out.println(b3);
		
	}
}
