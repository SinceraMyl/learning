/**
 * 条件运算符
 * @author 朱桐的性能怪兽
 *
 */
public class TestOpertor06 {
	public static void main(String[]args) {
		int score=80;
		String type=score<60?"不及格":"及格";
		System.out.println(type);
		
		if(score<60) {
			System.out.println("不及格");
		}else {
			System.out.println("及格");
		}
		
		
	}
}
