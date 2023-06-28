package p02;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		int lotto[] = new int[6]; //배열 크기가 6인것으로 초기화
		
		Random r = new Random(); //랜덤 인스턴스 생성
		
		for(int i = 0; i<lotto.length; i++) { //lotto.length는 배열 크기를 알수있음
			lotto[i] = r.nextInt(45); //45중에 정수형 숫자한개 초기화
			System.out.println(lotto[i]); // 배열출력
			
		}
		
		
		
	}
}
