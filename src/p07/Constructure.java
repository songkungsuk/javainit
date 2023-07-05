package p07;

public class Constructure {
	
	
	public Constructure() {
		// TODO Auto-generated constructor stub
		System.out.println("기본 생성자임 ㅋㅋ");
	}
	
	Constructure(int num){
		System.out.println("overloading 을 이용한 생성자 만들기.");
	}

	public static void main(String[] args) {
		Constructure c = new Constructure();
		
	}
}
