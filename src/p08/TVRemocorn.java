package p08;

public class TVRemocorn extends Remocon implements Remote {
	public static void main(String[] args) {
		//TVRemocorn Remocon Remote Object
	}
	
	public void on() {
		System.out.println("TV 리모컨사용");
	}
	
	public void off() {
		System.out.println("TV 끄기");
	}
	public void chup() {
		System.out.println("채널을 올립니다");
	}
	public void chdown() {
		System.out.println("채널을 내립니다");
	}
}
