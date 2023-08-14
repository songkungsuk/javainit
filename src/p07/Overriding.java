package p07;
class Coffee{
	public String name;
	public int price;
	
	public String toString() {
		return "name : " + name + " price :" + price;
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Coffee c1 = new Coffee();
		Coffee c2 = c1;
		Object oj = c2;
		
		System.out.println(c1);
		c1.name ="Americano";
		c1.price = 2000;
		
		String str = c1.toString();
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(oj.toString());
	}
}
