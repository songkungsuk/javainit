package p07;

class Song{
	public int rank;
	public String title;
	public void printTitle() {
		System.out.println(title);
	}
	
}


public class Son extends Father{ //Son, Father, Object 3가지의 이름으로 불린다/
	public String hobby;
	//Father class 에는 extends Object가 생략되어있다
	public static void main(String[] args) {
		Son s = new Son();
		Father f = new Son();
		Object o = new Object(); //object는 뭐지 ? extends Object 가 항상 숨어있엇다....!
		Object oo = new String();//object는 객체 이다.
		s.name = "song";
		s.job = "programer";
		s.age = 27;
		s.hobby = "music";
		s.printjob();
		f.name = "말도안됨";
		

		Son s2 = (Son)f;
		s2.hobby = "game";
		System.out.println(s2.name);
		
		Sonn sonn = new Sonn();
		sonn.name = "hi";
		sonn.hobby = "travel";
		sonn.printhobby();
		
		Song song = new Song();
		song.title = "song";
		song.printTitle();
		
		
		Father father = new Father();
		s2 = (Son) father;
		
		
	}
}
