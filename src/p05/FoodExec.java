package p05;

public class FoodExec {
	
	public static class Product {
		String name;
		int price;
		String type;
	}
	
	public static void printpro(Product[] p) {
		for (Product product : p) {
			System.out.println(product.name);
			System.out.println(product.price);
			System.out.println(product.type);	
		}
		
	}
	public static void main(String[] args) {

		Product product1 = new Product(); //new를 사용하면 공간을 할당하므로 널값으로 초기화해줌
		
		product1.name = "computer";
		product1.price = 3000000;
		product1.type = "machine";
		
		Product abc = new Product();
		abc.name = "computer2";
		abc.price = 30000300;
		abc.type = "machine2";
		
//		printpro(product1);
//		printpro(abc);
//		
		
		Product[] product = new Product[2];
		product[0] = product1;
		product[1] = abc;
		
		printpro(product);
		
		
	}
}
