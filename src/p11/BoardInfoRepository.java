package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import p10.dbCon;

public class BoardInfoRepository {
	public static Connection con = dbCon.getCon();
	public List<Map<String, String>> getinfo(){
		List<Map<String, String>> table = new ArrayList<Map<String,String>>();
		
		
		try {
			
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM BOARD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> boardData = new HashMap<String, String>();
				boardData.put("BI_NUM", rs.getString("BI_NUM"));
				boardData.put("BI_TITLE", rs.getString("BI_TITLE"));
				boardData.put("BI_CONTENT", rs.getString("BI_CONTENT"));
				boardData.put("BI_WRITER", rs.getString("BI_WRITER"));
				boardData.put("BI_CREDAT", rs.getString("BI_CREDAT"));
				boardData.put("BI_CNT", rs.getString("BI_CNT"));
				
				table.add(boardData);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return table;
	}
	
	public int insertData() {
		int cnt = 0;
		try {
			
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO BOARD_INFO(BI_TITLE, BI_CONTENT, BI_WRITER, BI_CREDAT, BI_CNT)\r\n"
					+ "VALUES('첫번째 게시물', '제곧내', '전한녁1', NOW(), 0)";
			cnt = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cnt;
	}
	
	public int deleteData() {
		int cnt = 0;
		try {
			
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM BOARD_INFO WHERE BI_WRITER = '전한녁1'";
			cnt = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cnt;
		
	}
	
	public int updatedata(Map<String, String> data) {
		try {
			
			Statement stmt = con.createStatement();
			String sql = "UPDATE BOARD_INFO SET ";
			if(data.get("BI_TITLE") != null) {
				sql += "BI_TITLE ='" + data.get("BI_TITLE") + "',";
			}
			if(data.get("BI_CONTENT") != null) {
				sql += "BI_CONTENT ='" + data.get("BI_CONTENT") + "',";
			}
			if(data.get("BI_WRITER") != null) {
				sql += "BI_WRITER ='" + data.get("BI_WRITER") + "',";
			}
			if(data.get("BI_CREDAT") != null) {
				sql += "BI_CREDAT ='" + data.get("BI_CREDAT") + "',";
			}
			if(data.get("BI_CNT") != null) {
				sql += "BI_CNT ='" + data.get("BI_CNT") + "',";
			}
			
			sql = sql.substring(0, sql.length()-1);
			sql += "WHERE BI_NUM=" + data.get("BI_NUM");
			return stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	
	public static void main(String[] args) {
		BoardInfoRepository repo = new BoardInfoRepository();
		List<Map<String, String>> myList = new ArrayList<Map<String,String>>();
		myList = repo.getinfo();
		Map<String, String> map = new HashMap<String, String>();
		for(Map<String, String> icanfly : myList) {
			System.out.println(icanfly);
		}
		System.out.println();
		int cnt = repo.insertData();
		System.out.println("[Insert]변경된 컬럼수 : " + cnt);
		
		myList = repo.getinfo();
		for(Map<String, String> icanfly : myList) {
			System.out.println(icanfly);
		}
		System.out.println();
		
		cnt = repo.deleteData();
		System.out.println("[Delete]변경된 컬럼수 : " + cnt);
		myList = repo.getinfo();
		for(Map<String, String> icanfly : myList) {
			System.out.println(icanfly);
		}
		System.out.println();
		map.put("BI_NUM", "1");
		map.put("BI_CNT", "1");
		cnt = repo.updatedata(map);
		System.out.println("[Update]변경된 컬럼수 : " + cnt);
		
		myList = repo.getinfo();
		for(Map<String, String> icanfly : myList) {
			System.out.println(icanfly);
		}
		
	
	}
}
