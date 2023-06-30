package p05;

public class SongExec {
	public static void prtsong(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Song[] song = new Song[5];

		song[0] = new Song();
		song[0].name = "songngsuk1";
		song[0].rank = 1;
		song[0].singer = "s";


		song[1] = new Song();
		song[1].name = "songku";
		song[1].rank = 1;
		song[1].singer = "o";


		song[2] = new Song();
		song[2].name = "sonungsuk";
		song[2].rank = 2;
		song[2].singer = "n";


		song[3] = new Song();
		song[3].name = "songsuk";
		song[3].rank = 3;
		song[3].singer = "g";


		song[4] = new Song();
		song[4].name = "songkungsuk4";
		song[4].rank = 4;
		song[4].singer = "song";

		int max = song[0].rank;
		int max_index = 0;
		int min = song[0].rank;
		int min_index = 0;
		
		for(int i=0; i<song.length; i++) {
			if(max < song[i].rank) {
				max = song[i].rank;
				max_index = i;
			}
		}

		System.out.println("제일 인기 없는 음악" + song[max_index].name);

		for(int i=0; i<song.length; i++) {
			if(min > song[i].rank) {
				min = song[i].rank;
				min_index = i;
			}
		}
		System.out.println("제일 인기 있는 음악" + song[min_index].name);
	}
}
