package p02;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i =0; i<lotto.length; i++) {
			double rNum = Math.random() * 45 +1; // 0 - 0.99999999999
			lotto[i] = (int) rNum;
//			int num = rNum *10;
			
		}
		
		for(int j = 0; j<lotto.length; j++) {
			System.out.println(lotto[j]);
		}
		
	}
}
