package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.dbCon;

public class BoardInfoRepository {
	public List<Map<String, String>> getinfo(){
		List<Map<String, String>> table = new ArrayList<Map<String,String>>();
		
		
		try {
			Connection con = dbCon.getCon();
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
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO BOARD_INFO(BI_TITLE, BI_CONTENT, BI_WRITER, BI_CREDAT, BI_CNT)\r\n"
					+ "VALUES('첫번째 게시물', '제곧내', '전한녁', NOW(), 0)";
			cnt = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cnt;
	}
	
	public int deleteData() {
		int cnt = 0;
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM BOARD_INFO WHERE BI_NUM = 1";
			cnt = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cnt;
		
	}
	
	public static void main(String[] args) {
		BoardInfoRepository repo = new BoardInfoRepository();
		List<Map<String, String>> myList = new ArrayList<Map<String,String>>();
		myList = repo.getinfo();
		
		for(Map<String, String> icanfly : myList) {
			System.out.println(icanfly);
		}
	}
}
