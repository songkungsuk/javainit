package p01;

public class StringCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123";
		if(s1 == "123") {
			System.out.println("s1 = 123");
		}else {
			System.out.println("s1 은 123은 아님");
		}
		String s2 =new String("123");
		if(s2 == "123") {
			System.out.println("s2 = 123");
		}else {
			System.out.println("s2 는 123은 아님");
		}
		String s5 = new String("1");
		System.out.println("1".equals(s5));
		System.out.println(s5.equals("1")); //이방법은 지양할것 - 가독성이 안좋음
		
	}

}
