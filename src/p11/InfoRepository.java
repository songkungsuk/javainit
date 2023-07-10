package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.dbCon;

public class InfoRepository {
	public List<Map<String, String>> getInfo(){
		List<Map<String, String>> myList = new ArrayList<Map<String,String>>();
		
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM class_info";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("CI_NAME", rs.getString("CI_NAME"));
				map.put("CI_DESC", rs.getString("CI_DESC"));
				
				myList.add(map);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return myList;
	}
	
	public int insertData(Map<String, String> map) {
		int cnt = 0;
		
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO class_info(CI_NAME, CI_DESC) VALUES('" + map.get("CI_NAME") + "','"+ map.get("CI_DESC") +"')";
			cnt = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cnt; 
	}
	
	public int deleteData(Map<String, String> map) {
		int cnt = 0;
		
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM class_info WHERE CI_NAME = '" + map.get("CI_NAME") +"'";
			cnt = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cnt; 
	}
}
