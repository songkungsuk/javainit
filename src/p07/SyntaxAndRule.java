package p07;
class Test{
	
}
class Teststr{
	
}
public class SyntaxAndRule {
	
	public static void main(String[] args) {
	
		// 규칙을 안지켜도 프로그램은 실행됨
		// 문법을 안지키면 프로그램은 실행됨
		//------------------ 규칙 -------------------------------
		int num; //variable first word is always Downcasting
		int n1; 
		int numStr; // 두 글자가 합성될때는 뒤에있는 단어 첫 글자가 대문자여야한다.
		//패키지명 두단어를 사용할때는 . 참조를 사용한다 ex)song.kung
		//클래스명 첫글자는 대문자// 한글 한문 일본어 하지말기
		//배열로 선언할때는 복수로 쓴다 ex) num -> nums
		
		//--------------------------- 문법 ----------------------
		
		//int 1; 첫글자가 숫자인경우는 변수선언 불가능
		//int `p;// 특수문자 안됨
		int _n; // 특이한 케이스로 언더바됨
		int $n; // 달러도 됨 중요한 변수라고 표시할때 사용함 - 고급 개발자 이상부터 가능
		//패키지 명은 숫자로만 이루어 질수 없다.
		//패키지 명에 대문자는 사용할 수 없다.
		
		
		
	}
}
