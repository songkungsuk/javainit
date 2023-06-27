package p02;

public class AcessModifier {
	int b = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println(i);
		AcessModifier am = new AcessModifier();
		System.out.println(am.b);
		am.b = 5;
		AcessModifier aml = new AcessModifier();
		System.out.println(am.b == aml.b);
		
	}

}
