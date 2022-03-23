/**
 * 测试switch语句
 * @author 朱桐的性能怪兽
 *
 */
public class TestSwitch {
	public static void main(String[]args) {
		int month=(int)(1+12*Math.random());
		System.out.println("月份:"+month);
		
		switch(month) {
		case 1:
			System.out.println("一月份");
			break;
		case 2:
			System.out.println("二月份");
			break;
		default:
			System.out.println("我是其他月份");
		
		
		}
		
	}
}
