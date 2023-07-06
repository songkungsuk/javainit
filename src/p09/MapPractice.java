package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
		

		Map<String, String> maple = new HashMap<String, String>();
		maple.put("name", "han");
		maple.put("job", "pirate");
		maple.put("level", "276");
		
		Map<String, String> maple2 = new HashMap<String, String>();
		maple2.put("name", "song");
		maple2.put("job", "Ark&Mage");
		maple2.put("level", "290");
		
		
		Map<String, String> maple3 = new HashMap<String, String>();
		maple3.put("name", "song1");
		maple3.put("job", "Ark&Mage1");
		maple3.put("level", "2901");
		
		List<Map<String, String>> mapleRank = new ArrayList<>();
		mapleRank.add(maple);
		mapleRank.add(maple2);
		mapleRank.add(maple3);
		
		for(Map<String, String> maplelist : mapleRank) {
			Iterator<String> it = maplelist.keySet().iterator();
			
			while(it.hasNext()) {
				
				String key = it.next();
				System.out.println(key + " : " + maplelist.get(key));
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Map<String, List<Map<String, String>>> excel = new HashMap<>();
//		excel.put("sheet1", mapleRanking);
//		
//		Iterator<String> it = excel.keySet().iterator();
//		
//		while (it.hasNext()) {
//			String key = it.next();
//			System.out.println(key + " : " + excel.get(key));
//			
//		}
//		
//		
//		for(int i=0; i<mapleRanking.size(); i++) {
//			Map<String, String> mapping = mapleRanking.get(i);
//			Iterator<String> it = mapping.keySet().iterator();
//			while(it.hasNext()) {
//				String key = it.next();
//				System.out.print(key + " : "+ mapping.get(key) + ", ");
//			}
//			System.out.println();
//			
//			
//		}
		
		
		
		
		
		
		
		
		
	}
}
