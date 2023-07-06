package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("omg", 123);
		map.put("여행지", 125);
		map.put("age", 13);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("omg"));
		System.out.println(map.containsKey("age"));
		System.out.println(map.get(11));
		System.out.println(map.replace("omg", 125, 100));
		System.out.println(map);
		System.out.println();
		Set<String> keySet = map.keySet();
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
			
		
	}
}
