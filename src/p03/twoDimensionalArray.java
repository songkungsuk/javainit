package p03;

public class twoDimensionalArray {
	
	public static void main(String[] args) {
	
		int[][] numArray = new int[3][3];
		System.out.println(numArray[1].length);
		System.out.println(numArray.length);
		
		System.out.println();
		for (int i = 0; i < numArray.length; i++) {
			for(int j=0; j<numArray[i].length; j++) {
				numArray[i][j] = 1;
			}
		}
		
		for (int i = 0; i < numArray.length; i++) {
			for(int j=0; j<numArray[i].length; j++) {
				System.out.print(numArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
