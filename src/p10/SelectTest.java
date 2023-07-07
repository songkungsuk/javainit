package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;

public class SelectTest {
	public static void main(String[] args) {
		
		
		
		
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String uiId = rs.getString("UI_ID");
				String uiPW = rs.getString("UI_PWD");
				String uiName = rs.getString("UI_NAME");
				String uiNum = rs.getString("UI_NUM");
				System.out.println(uiId +" "+ uiPW +" "+ uiName +" "+ uiNum);
				
			}
			
			
		} catch (Exception e) {
			
		}
	}
}
