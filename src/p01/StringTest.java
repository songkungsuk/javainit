package p01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234567890";
		char a = str.charAt(6);
		System.out.println(a);
		System.out.println(str.equals(str));
		
		String s1 = "1";
		String s2 = "1";
		System.out.println(s1 == s2);
		String s3 = new String("1");
		System.out.println(s1 == s3);//s1하고 s3가 저장되는 메모리 영역이 다르므로 False가 뜸
		String s4 = new String("1");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4)); // equals 는 값만을 비교한다
		
		int ix = str.indexOf("6"); //6이 있는 인덱스의 위치는 어디 있냐
		System.out.println(ix);  
		String str2 = str.substring(ix); //문자열 자르기...
		System.out.println(str2);
		String str3 = str.substring(1, 3); // 문자열자르기 2
		System.out.println(str3);
		str = str.replace("1", "so"); //바꿔치기
		System.out.println(str);
		
		String name = "song";
		name = name.toUpperCase(); // 대문자화
		System.out.println(name);
		name = name.toLowerCase(); // 소문자화
		System.out.println(name);
		
				
	}

}
