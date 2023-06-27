package p02;

public class ArrayTest3 {
	public static void main(String[] args) {
		
		String[] str = new String[10];
		
		
		for(int i=0; i<10; i++) {			
			str[9-i] = i+"";	
		}
		for(int i=0; i<10; i++) {			
			System.out.println("str[" + i + "] = "+str[i]);
		}
		
	}
}
