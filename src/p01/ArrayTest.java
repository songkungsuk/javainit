package p01;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6]; //배열의 단점 개수를 정해줘야한다
		
		for(int i=0; i<5; i++) {
			System.out.println(lotto[i]);
		}
		
		lotto[0] = 1;
		System.out.println(lotto[0]);
		
	}

}
