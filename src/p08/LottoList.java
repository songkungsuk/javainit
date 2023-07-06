package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {
	
	public static void main(String[] icanfly) {
		List<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i<6; i++) {
			int randNum = r.nextInt(7) + 1;
			
			if(i== 0) {
				lotto.add(randNum);
			}
			else if(lotto.indexOf(randNum) != -1) {
				i--;
			}
			else
			{
				lotto.add(randNum);
				
			}
			
		}
		
		for(int i=0; i<lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}
		
	}
}
