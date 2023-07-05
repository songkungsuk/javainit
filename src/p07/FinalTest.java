package p07;

public class FinalTest {
	final static int TAG_TEST = 100 ; //메인메소드 밖에서 상수 선언할 때 에는 대문자로 사용해야한다 
	//단어를 합성할때에는 언더바 사용 [상수 선언]
	final static int NUM = 100 ;
	//final 은 변수, 클래스, 메소드에 사용할 수 있다.
	
	public static void main(String[] args) {
		//int for; 예약어는 변수명으로 사용할수없다.
		//int final; 
		final int num = 1;
		// num = 2; X 사용할 수 없다.
		
	}
}
