package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int Correct = 0; //맞춘개수
		
		/*boolean condition = true; //입력을 잘못한경우 다시물어보기/*/
	
		System.out.println("번호를 입력해 주세요"); //번호입력
		String input = s.nextLine(); //입력하기
		String lottoStr = input; // 스플릿으로 분리할 것
		int[] lottonum = new int[5]; //로또번호배열 5개 생성
		
		String[] strs = lottoStr.split(", "); //,공백으로 스플릿
		
		System.out.println("내가 입력한 번호"); //내가 입력한 번호 보여주기
	
		
		
		for(int i=0; i<lottonum.length; i++) {
			lottonum[i] = r.nextInt(45)+1; // 1~45 랜덤생성
			
			for(int j=0; j<i; j++) {
				if(strs[j].equals(Integer.toString(lottonum[i]))) { //중복제거
					i--;
				}
			}
		}	
		
		System.out.println("로또 번호"); //로또번호 보여주기
		for(int i=0; i<strs.length; i++) {
			System.out.println(lottonum[i]);
			
			if(strs[i].equals(Integer.toString(lottonum[i]))) { //로또번호가 맞으면 맞은개수 추가
				Correct++;
			}
		}
		
		System.out.println("당신이 맞춘 로또번호 개수는 : "+ Correct + " 입니다.");
	}
	
	

}
