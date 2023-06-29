package p04;

public class MethodTest4 {
	
	public static int[] getArr() {
		int[] abc = new int[6];
		for(int i=0; i<abc.length; i++) {
			abc[i] = MethodTest2.getRandNum(6);
			for(int j=0; j<i; j++) { //중복제거
				if(abc[i] == abc[j]) {
					i--;
				}
			}
		}
		
		return abc;
	}
	public static void printarr(int[] array) { //출력함수
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] lotto = getArr(); //함수로 랜덤 생성한 배열을 lotto 정수형 배열에 저장
		
		printarr(lotto);
	}
}
