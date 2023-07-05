package p07;
class Mother{
	public void work() {
		System.out.println("어머님이 집안일을 하십니다.");
	}
}

class Daugther extends Mother {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		super.work();
		System.out.println("딸이 집안일을 도웁니다");
	}
	
	public void work(String job) {
		System.out.println("딸이 " + job + "을 합니다.");
	}
	
}
public class Overriding2 {
	public static void printwork(Mother[] mothers) {
		for(int i=0; i<mothers.length; i++) {
			if(mothers[i] instanceof Daugther) {
				Daugther d = (Daugther) mothers[i];
				d.work("개발");
				System.out.println("딸, 어머니, Object로 부를수있습니다");
			}
			else {
				mothers[i].work();
				
				System.out.println("어머니, Object로 부를수있습니다");
			}
			
		}
		
	}
	public static void main(String[] args) {
		Daugther d = new Daugther();
		Mother m = new Mother();
		
		System.out.println(d instanceof Mother);
		System.out.println(m instanceof Mother);
		
		System.out.println(d instanceof Daugther);
		System.out.println(m instanceof Daugther);
		
		Mother[] ms = new Mother[2];
		ms[0] = d;
		ms[1] = m;
		
		printwork(ms);
		
		
		
		
		
	}
}
