package p08;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		//1.7 이상 표준이 아님
		ArrayList<String> strList = new ArrayList<String>(); 
		
		//이것이 표준임
		ArrayList<String> strList2 = new ArrayList<>();
		
		/*
		 * Collection Framework
		 * List Set Map : Interface		
		*/		
		List<String> strList3 = new ArrayList<>();
		strList3.add("finish");
		
		strList3.remove(0);
		
	}
}
