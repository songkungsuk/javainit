package p03;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] age = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] tmp = age;
		Scanner s = new Scanner(System.in);
		
		System.out.println("배열의 길이를 입력해주세요");
		
		int num = s.nextInt();
		age = new int[num]; //스캐너로 입력받음
		
		if(age.length > tmp.length) { //age배열이 tmp배열보다 크면
			for(int i=0; i<tmp.length; i++) { //더작은쪽으로 길이를 정함
				age[i] = tmp[i];
			}	
		}else {
			for(int i=0; i<age.length; i++) {
				age[i] = tmp[i];
			}
		}
		
		
		for(int i=0; i<age.length; i++) { //출력
			System.out.println(age[i]);
		}
	}
}
