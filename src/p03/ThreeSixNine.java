package p03;

public class ThreeSixNine {
	public static void main(String[] args) {
		//3 6 9
		
		System.out.println("3 6 9 게임");
		
		for(int i=1; i<101; i++) {
			if(Integer.toString(i).contains("3")) { //일의 자리가 3 이거나 십의자리가 3 인경우
				System.out.println("숫자" + i + "★");
			}
			else if(i%5 == 0 && Integer.toString(i).contains("3") || i%5 == 0 && Integer.toString(i).contains("6") || i%5 == 0 && Integer.toString(i).contains("9")) {
				System.out.println("숫자" + i + " 만세 " + "★");
			}
			else if(Integer.toString(i).contains("6")) { 
				System.out.println("숫자" + i + "★");
			}
			else if(Integer.toString(i).contains("9")) {
				System.out.println("숫자" + i + "★");
			}
			else if(i%5 == 0) {
				System.out.println("숫자" + i + "만세");
			}
			
		}
	}
}
