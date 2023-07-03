package p06;

public class AnimalExec {
	public static void printfly(Animal animal) {
		if("조류".equals(animal.type)) {
			animal.fly();
		}
	}
	public static void main(String[] args) { //static 안에서 static 밖에 못씀
		//Static이아니면 객체를 생성해 static 영역에 인스턴스를 붙이고 메소드를 사용 (?)
		Animal cat = new Animal();
		cat.name = "NAvi";
		cat.adress = "land";
		cat.trans = "none";
		//cat.type ="포유류";
		cat.eat();
		cat.run();
		cat.hunt();
		
		Animal bird = new Animal();
		bird.name = "GamaUzi";
		bird.type = "조류";
		bird.run();
		bird.eat();
		bird.hunt();
		
		Animal[] myAnimal = new Animal[2];
		myAnimal[0] = cat;
		myAnimal[1] = bird;
		
		for(int i=0; i<myAnimal.length; i++) {
			myAnimal[i].run();
			myAnimal[i].eat();
			if(!myAnimal[i].name.equals("NAvi")) {
				myAnimal[i].hunt();
			}
			
			printfly(bird);
			
			
		}
		
	}
}
