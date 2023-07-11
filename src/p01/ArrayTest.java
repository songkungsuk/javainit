package p01;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]lotto = new int[][] {{1,2,3,4,5},{5,4,3,2,1}}; //배열의 단점 개수를 정해줘야한다
		
		for(int i=0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.println("lotto[" + i + "][" + j + "]= " + lotto[i][j]);
				
			}
		}
	
		
		
	}

}
