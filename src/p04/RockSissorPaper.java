package p04;

import java.util.Random;
import java.util.Scanner;

public class RockSissorPaper {
	public static String getRock() {
		Random r = new Random();
		int randnum = r.nextInt(3)+1;
		switch (randnum) {
		case 1:
			return "가위"; //가위
			
		case 2:
			return "바위"; //바위
			
		case 3:
			return "보"; //보
		default:
			return "";
		}
	}
	
	public static void compare(String input, String condittion) {
		if(input.equals(condittion)) {
			System.out.println("비겼습니다------------");	
		}
		else if(condittion.equals("가위") && input.equals("보") || condittion.equals("바위") && input.equals("가위") || condittion.equals("보") && input.equals("바위")){
			System.out.println("졌습니다1");
		}
		else if(condittion.equals("가위") && input.equals("바위") || condittion.equals("바위") && input.equals("보") || condittion.equals("보") && input.equals("가위")){
			System.out.println("이겼습니다1");
		}
		

	}
	public static void main(String[] args) {
		String condittion = getRock();
		
		System.out.println(condittion);
		System.out.println("다음중 하나를 입력해주세요[가위, 바위, 보]");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		compare(input, condittion);
				
	}
}
