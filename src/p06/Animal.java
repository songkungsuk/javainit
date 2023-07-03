package p06;

public class Animal {
	
	public String name;
	public String type;
	public String trans;
	public String adress;
	
	public void eat() {
		System.out.println(name + "이/가 먹는다.");
	}
	
	public void run() {
		System.out.println(name + "이/가 뛴다.");
	}
	
	public void hunt() {
		System.out.println(name + "이/가 사냥한다.");
	}
	
	public void fly() {
		System.out.println(name + "이/가 난다.");
	}
}
