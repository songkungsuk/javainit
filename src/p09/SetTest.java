package p09;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		System.out.println(set.size());
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set.size());
		
	}
}
