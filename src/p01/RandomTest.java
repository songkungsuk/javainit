package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int i = r.nextInt(10)+1;
		System.out.println(i);
		int j  = r.nextInt(10)+1;
		System.out.println(j);
		int k = r.nextInt(10)+1;
		System.out.println(k);
		
		int num[] = new int[6];
		
		for(int l=0; l<3; l++) {
			num[l] = r.nextInt(10)+1;
			System.out.println(num[l]);
		}
		
		
		
		
	}

}
