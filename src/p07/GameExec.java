package p07;

public class GameExec {
	public static void runGame(GameClass game) {
		game.start();
		game.playing();
		game.stop();
	}
	
	public static void main(String[] args) {
		Starcraft starcraft = new Starcraft();
		starcraft.name = "스타크래프트";
		
		MapleStroy mapleStroy = new MapleStroy();
		mapleStroy.name = "메이플스토리";
		
		runGame(starcraft);
		runGame(mapleStroy);
	}
}
