package p02;

public class GuGuDan3 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			System.out.println(1 + "X" + i + " = " + i*1);
		}
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "X" + j + " = " + i*j);
			}
		}
		/*
		for(int i=1; i<10; i++) {
			System.out.println(3 + "X" + i + " = " + i*3);
		}
		for(int i=1; i<10; i++) {
			System.out.println(4 + "X" + i + " = " + i*4);
		}*/
	}
}
