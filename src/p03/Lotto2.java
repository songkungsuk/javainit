package p03;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		int lotto[] = new int[40];
		Random r = new Random();
		
		for(int i=0; i<lotto.length; i++) { //반복문실행
			lotto[i] = r.nextInt(40)+1;
			
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
		
		for(int k=0; k<lotto.length; k++) {
			System.out.println("lotto["+ k + "] = "+lotto[k]);
		}
	}
}
