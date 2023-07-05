package p07;

public class GameClass {
	String name;
	int price;
	
	
	public void start() {
		System.out.println(name + "을 시작합니다.");
		
	}
	public void playing() {
		System.out.println(name + "을 하고 있는중 입니다");
	}
	public void stop() {
		System.out.println(name + " 을 종료합니다.");
	}
}
