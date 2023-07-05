package p07;


public class Overloading {
	public static void test2() {
		System.out.println("None Parameter");
	}
	public static void test2(char param) {
		System.out.println(param + " Parameter");
	}
	public static void test2(String str) {
		System.out.println(str +"String Parameter");
	}
	public static void test2(byte param) {
		System.out.println(param + " Parameter");
	}
	public static void test2(int param) {
		System.out.println(param + " Parameter");
	}
	public static void test2(float param) {
		System.out.println(param + " Parameter");
	}
	public static void test2(boolean param) {
		System.out.println(param + " Parameter");
	}
	public static void test2(double num) {
		System.out.println("double Parameter");
	}
	public static void test2(int num, String name) {
		System.out.println("test2 parameter 2 pieace");
	}
	
	
	
	public static void main(String[] args) {
		//public -> protected -> default -> private
		//public 모두 사용가능
		//protected 상속 받으면 사용가능
		//default 다른 패키지에서 사용 불가능 / 같은 클래스에서만 사용가능
		//private 모두안됨 자기자신 내에서만 가용가능
		
		Overloading overloading = new Overloading();
		overloading.test2("asb");
		overloading.test2(1,"ab");
		overloading.test2();
		overloading.test2(1.1);
		overloading.test2(0);
		overloading.test2(1.1F);
		overloading.test2(false);
		overloading.test2('a');
		
	}
}
