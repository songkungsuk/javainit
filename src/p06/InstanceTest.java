package p06;

class Car {
	
	public String name; //none static 인스턴스화가 필요하다
	public static String type; //class 변수 static 영역에 저장됨

}

public class InstanceTest {
	
	public static void main(String[] args) {
		
		Car.type = "RV";
		Car spotage = new Car();
		spotage.name = "Spotage_Hybrid";
		System.out.println(spotage.name);
		
	}
}
