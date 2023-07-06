package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		Random r = new Random();
		/*
		 * numList의 size가 20이 될때까지
		 * 랜덤값을 1-100까지 추가합니다.
		 * 단 중복은 안됨.
		 * 
		 * 출력할때 반복문으로 사용해서 출력
		 * 숫자에 3, 6, 9 가 있을때 짝 출력
		 * */
		while(intList.size() < 20) { 
			//랜덤 0~100 사이의 값 중복없이 넣기
			int num = r.nextInt(100);
			if(intList.indexOf(num) == -1) {
				intList.add(num);
			}
		}
		
		for(int i=0; i < intList.size(); i++) {
			String myData = Integer.toString(intList.get(i));
//			int one = intList.get(i) % 10;
//			int ten = intList.get(i) / 10;

			myData = myData.replace("3", "짝");
			myData = myData.replace("6", "짝");
			myData = myData.replace("9", "짝");
			
			System.out.println(myData +" "+ intList.get(i));
//			// 숫자의 십의자리에 3,6,9 가 포함된경우
//			if(ten == 3||ten == 6||ten == 9) 
//			{
//				//일의자리와 십의자리가 3,6,9가 둘다 있는경우
//				if(one%3 == 0 && ten%3 == 0) {
//					System.out.println("짝짝 : " + intList.get(i));
//				}
//				else {
//					System.out.println("짝 : " + intList.get(i));	
//				}
//				
//			}
//			// 숫자의 일의자리에 3,6,9 가 포함된경우 
//			else if(one == 3||one == 6||one == 9) 
//			{
//				System.out.println("짝 : " + intList.get(i));
//			}					
//			else {
//				//그외는 그냥 숫자 출력
//				System.out.println(intList.get(i));
//			}
//			
			
		}
		
	}
}
