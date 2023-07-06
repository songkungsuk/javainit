package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		/*
		 * List의 size가 50이 될때까지 추가를 해주세요.
		 * 값은 1부터 200까지의 랜덤 값인데
		 * 중복은 안되며
		 * 값이 홀수 일 경우에만 추가합니다
		 * */
		Random r = new Random();
		
		while(intList.size() < 50) {
			int num = r.nextInt(50)+1;
			
			if(num % 2 == 0 || intList.indexOf(num) != -1) continue;	
			
			intList.add(num);
		}
		
		System.out.println(intList);
		
		
	}
}
