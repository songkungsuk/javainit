package p02;

public class ArrayTest {
	public static void main(String[] args) {
		String[] str; // 변수의 선언
		String[] str2 = new String[2];//변수의 선언과 초기화
		
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		
		str2[0] = "1";
		str2[1] = "1";
		
		String a = "1";
		String b = "1";
		
		String[] strNums = new String[10];
		
		for(int i = 0; i<10; i++) {
			int num = i+1;
			strNums[i] = Integer.toString(num);
			System.out.println(strNums[i]);
		}
		
		
				
	}
}
