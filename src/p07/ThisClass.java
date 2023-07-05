package p07;

public class ThisClass {
	String name = "kdu";
	
	public void printName() {
		String name ="pppppaaaaaapaapappapapapaapapapap";
		System.out.println(name);
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		ThisClass class1 = new ThisClass();
		
		class1.printName();
	}
}
