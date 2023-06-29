package p04;

public class MethodTest3 {
	static int i = 1;
	/* 메서드의 종류
	 * void
	 * 데이터 타입
	 * - 기본형
	 * 		. 숫자
	 * 		. 문자 : char
	 * 		. 논리 : boolean
	 * - 참조형
	 * 		.기본형 제외
	 * */
	public static void test() {
		
	}
	public static int getNum() {
		return 1;
	}
	public static void main(String[] args) {
		int num = getNum();
		System.out.println(num);
		
	}
}
