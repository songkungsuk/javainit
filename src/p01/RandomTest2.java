package p01;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int num = r.nextInt(10);
		
		Scanner scanner = new Scanner(System.in);
		
		int input = Integer.parseInt(scanner.nextLine());
		
		if (num == input) {
			System.out.println("맞추셧습니다");
		}else {
			System.out.println("틀리셧습니다" + num);
		}
		int ToInt = Integer.parseInt("123");
		System.out.println(ToInt);
	}

}
