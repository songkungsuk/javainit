package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest1 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		
		m.put("name", "송경석");
		m.put("age", "25");
		m.put("address", "서울");
		
		Map<String, String> m1 = new HashMap<>();
		
		m1.put("name", "김진수");
		m1.put("age", "27");
		m1.put("address", "서울");
		
		Map<String, String> m2 = new HashMap<>();
		
		m2.put("name", "김아영");
		m2.put("age", "25");
		m2.put("address", "부산");
		
		Map<String, String> m3 = new HashMap<>();
		
		m3.put("name", "이왕균");
		m3.put("age", "20");
		m3.put("address", "광주");
		m3.put("car", "avante");
		
		
		List<Map<String, String>> mapList = new ArrayList<Map<String,String>>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);

		System.out.println(mapList);
	}
}
