package p06;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class NumberBaseball {

	
	public static void main(String[] args) {
		int[] baseball = new int[3];
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int strike = 0;
		int ball = 0;
//		boolean condition = true;
//		while(condition) {
			for(int i=0; i<baseball.length; i++) { //숫자 랜덤생성
				baseball[i] = random.nextInt(10);
				
				for(int j=0; j<i; j++) {
					if(baseball[i] == baseball[j]) { //중복제거
						i--;
					}
				}
			}
			for(int i=0; i<baseball.length; i++) {//baseball 출력
				System.out.print(baseball[i]);
			}
			System.out.println();
//			if(baseball[0] == 0) {
//				condition = false;
//			}
//		}
		System.out.println("서로 다른 숫자 3자리를 입력하시오.");
		int[] number = new int[3];
		String input_number = scanner.nextLine();
		for(int i=0; i<baseball.length; i++) {
			number[i] = Integer.parseInt(input_number.substring(i, i+1));
		}
		
		for(int i=0; i<baseball.length; i++) {
			if(baseball[i] == number[i]) {
				strike++;
			}
			
			for(int j=0; j<baseball.length; j++) {
				 if(i != j && baseball[i] == number[j]) {
					 ball++;
				 }
			}
		}
		
		
		
		for(int i=0; i<baseball.length; i++) {
			System.out.print(number[i]);
		}
		System.out.println();
	
		System.out.println("Ball : "+ ball + " Strike :" + strike );
	}
}
