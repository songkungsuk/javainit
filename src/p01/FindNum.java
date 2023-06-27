package p01;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(); //랜덤 객체 생성
		
		Scanner s = new Scanner(System.in); // 스캐너 객채로 입력받을 객체 생성
		
		for(int i = 0; i<3; i++) { // 반복문
			int num = r.nextInt(3)+1; // 랜덤숫자 생성 1-3
			System.out.print("숫자를 입력해주세요"); 
			int a = s.nextInt(); //숫자입력받기
			if(num == a) { // 조건문
				System.out.println("정답");
			}else {
				System.out.println("틀림");
			}
		}
	}

}
