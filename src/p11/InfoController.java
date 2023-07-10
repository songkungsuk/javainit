package p11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoController {
	public List<Map<String, String>> getInfo(){
		InfoService info = new InfoService();
		return info.getInfo();
	}
	public int insertData(Map<String, String> map){
		InfoService service = new InfoService();
		return service.insertValue(map);
	}
	public int deletData(Map<String, String> map){
		InfoService service = new InfoService();
		return service.deleteValue(map);
	}
	
	
	public static void main(String[] args) {
		List<Map<String, String>> myList = new ArrayList<Map<String,String>>();
		InfoController con = new InfoController();
		myList = con.getInfo();
		int num = 0;
		
		for(Map<String, String> map : myList) {
			System.out.println(map);
			System.out.println("조회 완료");
			
		}
		System.out.println();
		
		Map<String, String> insert = new HashMap<String, String>();
		insert.put("CI_NAME", "student2");
		insert.put("CI_DESC", "difficult");
		
		num = con.insertData(insert);
		System.out.println("[삽입] 변경된 컬럼수 : " + num);
		
		myList = con.getInfo();
		for(Map<String, String> map : myList) {
			System.out.println(map);
			System.out.println("조회 완료");
			
		}
		System.out.println();
		
		
		Map<String, String> delete = new HashMap<String, String>();
		delete.put("CI_NAME", "student2");
		num = con.deletData(delete);
		System.out.println("[삭제] 변경된 컬럼수 : " + num);
		
		myList = con.getInfo();
		for(Map<String, String> map : myList) {
			System.out.println(map);
			System.out.println("조회 완료");
			
		}
		System.out.println();
	}

}
