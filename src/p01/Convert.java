package p01;

public class Convert {
	public static void main(String args[]) {
		int i = 1;
		String s = "1";
		String s1 = i + "";
		System.out.println(s.equals(s1));
		
		int i1 = Integer.parseInt(s);
		System.out.println(i==i1);
		
		String str = "back";
//		int i2 = Integer.parseInt(str);
//		System.out.println(str); 문자열은 변환이 안됨
	}
}
