package p04;

import java.util.Scanner;

public class GuGuDan {
	
	public static void printgugu(int num, int num2) {
		for(int i=1; i<num+1; i++) {
			for(int j=1; j<num2+1; j++) {
				System.out.print( i + "X" + j + " = "+ i*j +" ");
			}
			System.out.println();
		}
	
	}
	
	public static void main(String[] args) {
		System.out.println("구구단 단수를 입력하시오");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int input2 = s.nextInt();
		
		printgugu(input, input2); //ex) 8, 9입력하면 8까지 9까지 된다
		
		Product p = new Product();
		p.setName("song");
		p.setPrice(1000);
		
	}
}
