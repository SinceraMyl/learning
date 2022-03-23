
public class TestHomeWork {
	public static void main(String[]args) {
		//用while循环分别计算100以内的奇数及偶数的和，并输出
		int sum01=0;
		int sum02=0;
		for(int a=1;a<=100;a++) {
			if(a%2==0) {//偶数
				sum01+=a;
			}else {//奇数
				sum02+=a;
			}
		}
		System.out.println("偶数和："+sum01);
		System.out.println("奇数和："+sum02);
		int h=0;
		for(int i=1;i<=1000;i++) {
			if(i%5==0) {
				System.out.print(i+"\t");
				h++;
			}
			if(h==5) {
				System.out.println();
				h=0;
			}
			/*if(i%25==0) {
				System.out.println();
			}*/
		}
		
		
		
		
	}
}
