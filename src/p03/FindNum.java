package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean uncorrect = false;
		
		//시작과 끝이 있을땐 for 문으로 쓰는것이 합리적
		//이벤트 처리방식일때는 while문이 좋다
		int i = 0;
		Random random = new Random();
		int randNum = random.nextInt(10) + 1;
		
		while (!uncorrect) {
			System.out.println("숫자를 입력하세요[1-10]");
			
			int inputNum = scan.nextInt();
			
			if(inputNum ==  randNum) {
				System.out.println("맞추셧습니다" + "틀린횟수 : " + i);
				uncorrect = true;
			}else {
				System.out.println("틀리셧습니다");
				i++;
			}
		}
		
		
	}
}
