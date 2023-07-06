package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		List<Integer> countList = new ArrayList<Integer>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요 : ");
		String numStr = s.nextLine();
		int cnt = 0;
		/*
		 * numStr, 를 기준으로 배열을 만드신후 List에 추가
		 * 
		 * */
		for(int i = 0; i<numStr.length(); i++) {
			
			String text = numStr.substring(i,i+1);
			
			int number = Integer.parseInt(text);
			
			countList.add(number);
			
			System.out.print(countList.get(i)+ " ");
		}
		System.out.println();
		System.out.println("숫자 3개를 입력해주세요 : ");
		numStr = s.nextLine();
		for(int i = 0; i<numStr.length(); i++) {
			String text = numStr.substring(i,i+1);
			
			int number = Integer.parseInt(text);
			
			for(int j = 0; j<numStr.length(); j++) {
				
				if(number != countList.get(j)) continue;
				
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
	}
}
