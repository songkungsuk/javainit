package p08;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		String str1 = "hi";
		String str2 = "my name";
		String str3 = "is";
		String str4 = "...";
		String str5 = "songkungsuk";
		
//배열에 방이 추가 될때 마다 배열의 크기를 조정해줘야 한다.
//이게 핵심..
		
		String[] strs = new String[5]; 
		strs[0] = str1;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = str5;
		
		for(int i=0; i<strs.length; i++) {
			System.out.print(strs[i]+ " ");
		}

		ArrayList<String> strss = new ArrayList<String>();
		
		strss.add(str1);
		strss.add(str2);
		strss.add(str3);
		strss.add(str4);
		strss.add(str5);
		
		System.out.println(strss.size());
		System.out.println(strss);
		
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		for(int i=0; i<integers.size(); i++) {
			integers.add(i);
			System.out.println(integers.get(i));
		}
		
		
		
		
	}
}
