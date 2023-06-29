package p04;

import java.util.Random;

public class MethodTest2 {
	public static int getRandNum(int YourNum) {//메소드는 리턴값이 있다
		//get set is has contain do 이름을 가진 메소드를 지정을 많이한다
		Random r = new Random();
		return r.nextInt(YourNum) + 1; 
		//r 인스턴스가 가진 메소드의 리턴타입이 정수형 타입이므로 연산이 가능하다
	}
	
	public static void main(String[] args) {
		int num = getRandNum(50);
		
		System.out.println(num);
		System.out.println(getRandNum(50));
		System.out.println(getRandNum(100));
		System.out.println(getRandNum(150));
	}
}
