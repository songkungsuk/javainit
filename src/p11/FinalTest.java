package p11;

class Test{ //class에 final이 붙으면 상속 불가능 
	public void test() { //method에 final은 오버라이딩 불가
		System.out.println("test");
		
	}
}


public class FinalTest extends Test{
	public void test() {
		System.out.println("final test");
	}
	public static void main(String[] args) {

	}
}
