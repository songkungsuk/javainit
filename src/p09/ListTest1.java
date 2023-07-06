package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		Random r = new Random();
		/*
		 * 반복문을 6번 돌려서 랜덤값을 List에 추가해주세요
		 * 단 랜덤값은 중복이 불가능합니다.
		*/
		
//		for(int i = 0; i<6; i++) {
//			int num = r.nextInt(15)+1;
//			
//			if(intList.indexOf(num) == -1) {
//				intList.add(num);
//			}
//			else {
//				i--;
//			}
//		}
//		
		while(intList.size() < 6) {
			int num = r.nextInt(100)+1;
			
			if(intList.indexOf(num) == -1) {
				intList.add(num);
			}		
		}
		
		int min = intList.get(0);
		int max = intList.get(0);
		int min_idx = 0;
		int max_idx = 0;
		for(int i = 1; i<intList.size(); i++) {
			if(min > intList.get(i)) {
				min = intList.get(i);
				min_idx = i;
			}
			 
			if(max < intList.get(i)) {
				max = intList.get(i);
				max_idx = i;
			}
		}
		
		System.out.println("min num is : " + min);
		System.out.println("max num is : " + max);
	}
}
