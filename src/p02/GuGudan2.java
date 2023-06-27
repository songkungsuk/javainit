package p02;

import java.util.Scanner;

public class GuGudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		/* input = 3
		 * 1 X 3 = 3
		 * 2 X 3 = 6
		 * 3 X 3 = 9
		 * */
		
		try {
			
			System.out.println("숫자를 입력해주세요 (1-9)");
			int input = a.nextInt();
			
			for(int i = 1; i<10; i++) {
				System.out.println(i + " X " + input + " = " + (i*input));
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자를 제대로 입력해주세요");
		}
	}

}
