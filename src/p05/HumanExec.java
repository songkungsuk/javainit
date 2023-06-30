package p05;

public class HumanExec {
	
	public static void printhu(Human[] human) {
		for (Human human2 : human) {
			System.out.println(human2.name);
		}
	}
	public static void printh(Human human) {
		System.out.println(human.money);
	}
	
	
	public static void main(String[] args) {
		Human[] people = new Human[5];
		
		for(int i=0; i< people.length; i++) {
			people[i] = new Human();
		}
		
		people[0].name = "Song";
		people[0].money = 1000;
		
		people[1].name = "Tomas";
		people[1].money = 3000;
		
		people[2].name = "Mike";
		people[2].money = 2000;
		
		people[3].name = "han";
		people[3].money = 10000;
		
		people[4].name = "Tom";
		people[4].money = 20000;
		
		int total = 0; // 모든사람의 돈의 총액
		int average = 0; // 모든사람의 돈의 평균
		for (Human human : people) {
			total += human.money;
		}
		
		average = total/people.length; //평균 구하기
		
		System.out.println("5명의 금액의 총합은 : " + total);
		System.out.println("5명의 금액의 평균은 : "+average);
		
		printhu(people);
		printh(people[0]);
	}
}
