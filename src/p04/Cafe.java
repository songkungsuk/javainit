package p04;

import java.util.Scanner;

public class Cafe {
	static int AllPrice = 10000; //제일 비싼 금액
	
	public static String getCoffee(String price) {
		
		if(Integer.parseInt(price) > AllPrice) { 
			return "거스름돈이 없습니다";
		}else {
			switch (price) {
			case "3000": 
				return "Ice_Americano";
			case "5000": 
				return "CafeLatte";
			case "10000": 
				return "expensive coffee";
			default:
				return "정확한 금액을 입력해주세요 [3000, 5000, 10000]";
			}	
		}
		
	}
	
	public static String getDrink(String order, int price) {
		if (price > AllPrice) {
			return "거스름돈이 없습니다";
		}
		
		return "주문하신" + order + "가 " + price + "원 입니다.";
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마를 지불 하시겠습니까?");
		String input = scanner.nextLine();
		
		String coffee = getCoffee(input);
		System.out.println(coffee);
		System.out.println(getDrink(coffee, Integer.parseInt(input)));
	}
}
