package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.dbCon;

public class UserInfoRepository {
	/*
	 * 
	*/
	public List<Map<String, String>> getUserInfo(Map<String, String> s){
		List<Map<String, String>> myList = new ArrayList<Map<String,String>>();
		
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO";
			if(s != null && s.get("UI_NAME") != null) {
				sql += " WHERE UI_NAME LIKE '%" + s.get("UI_NAME") +"%'";
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> userInfo = new HashMap<String, String>();
				userInfo.put("UI_NUM", rs.getString("UI_NUM"));
				userInfo.put("UI_NAME", rs.getString("UI_NAME"));
				userInfo.put("UI_ID", rs.getString("UI_ID"));
				userInfo.put("UI_PWD", rs.getString("UI_PWD"));
				myList.add(userInfo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return myList;
	}
	
	public int insertUserInfo(Map<String, String> userInfo) {
		int count = 0;
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO (UI_NAME, UI_ID, UI_PWD) VALUES('"+userInfo.get("UI_NAME")+"','"+userInfo.get("UI_ID")+"','"+userInfo.get("UI_PWD")+"')";
			count = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}
	
	public int deleteUserInfo(Map<String, String> map) {
		int count = 0;
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM USER_INFO WHERE UI_NAME = '" + map.get("UI_NAME") + "'";
			count = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}
}
 