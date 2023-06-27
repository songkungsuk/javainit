package p02;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("1-9까지 숫자 입력 : ");
		int input = Integer.parseInt(s.nextLine()); 
		System.out.println("내가 입력한 숫자 : " + input);
		
		for(int i=1; i<10; i++) {
			System.out.println(input + " X " + i +" = "+ input*i);
		}
	}

}
