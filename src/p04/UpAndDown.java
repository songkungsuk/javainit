package p04;

import java.util.Random;
import java.util.Scanner;



public class UpAndDown {
	public static void question(int rNum) {
		boolean con = true;
		
		Scanner scan = new Scanner(System.in);
		
		while(con) {
			
			String numStr = scan.nextLine();
			int NumInt = Integer.parseInt(numStr);
			if(NumInt == rNum) {
				System.out.println("맞추셧습니다");
				con = false;
			}else if (rNum > NumInt) {
				System.out.println("Up");
			}else if (rNum < NumInt) {
				System.out.println("Down");
			}
		}
	}
	public static void main(String[] args) {
		
		Random random = new Random();
		int rNum = random.nextInt(50)+1;
		
		
		
		System.out.println("1-50 : ");
		
		
		question(rNum);
		
	}
}
