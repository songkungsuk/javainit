package p08;

import java.util.ArrayList;
import java.util.Map;

public class ListTest2 {
	public static void main(String[] args) {
		float[] fls = new float[3];
		fls[0] = 1.1f;
		fls[1] = 22.1f;
		fls[2] = 0.2123f;
		
		String[] strs = new String[3];
		strs[0] = "we";
		strs[1] = "are";
		strs[2] = "fighting";
		
		Object[] obj = new Object[3];
		obj[0] = fls;
		obj[1] = strs;
		ArrayList<Float> flist = new ArrayList<Float>();
		ArrayList<String> slist = new ArrayList<String>();
	
		for(int i=0; i<3; i++) {
			flist.add(fls[i]);
			slist.add(strs[i]);
			System.out.println(flist.get(i));
			System.out.println(slist.get(i));
		}
		

	}
}
