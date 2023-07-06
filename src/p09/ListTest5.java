package p09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(10);
		lists.add(1);
		lists.add(35);
		lists.add(17);
		lists.add(4);
		Collections.sort(lists);
//		int temp=0;
		
//		for(int i = 0; i<lists.size(); i++) {
//			for(int j = i+1; j<lists.size(); j++) {
//				
//				if(lists.get(i) > lists.get(j)) { 
//				//기존에있는것보다 다른게작으면 바꿔치기 즉 제일 작은수가 왼쪽으로 간다
//					temp = lists.get(i);
//					lists.set(i, lists.get(j));
//					lists.set(j, temp);
//				}
//				
//			}		
//	
//		}
		System.out.println(lists);
		
	}
}
