package p08;

public class AirconRemoconExec extends Remocon{
	
	public static void main(String[] args) {
		
		Remote[] re = new Remote[2];
		re[0] = new AirConditioner();
		re[1] = new TVRemocorn();

		for(int i=0; i< re.length; i++) {
			re[i].on();
			
			if(re[i] instanceof AirConditioner) {
				AirConditioner air = (AirConditioner) re[i];
				air.temup();
				air.temdown();
				System.out.println("에어컨으로, 리모트, 오브잭트 , 리모컨  불리는 객체 입니다.");
			}
			else if(re[i] instanceof TVRemocorn) {
				TVRemocorn tv = (TVRemocorn) re[i];
				tv.chup();
				tv.chdown();
				System.out.println("티비 리모컨, 리모트, 오브잭트 , 리모컨 으로 불리는 객체 입니다.");
			}
			re[i].off();
		}
	}
}
