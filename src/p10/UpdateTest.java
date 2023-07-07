package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateTest {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:kd", "root", "kd1824java");
			String sql ="UPDATE user_info SET UI_NAME = 'songkungsuk' WHERE UI_NUM = 8";
			Statement stmt = con.createStatement();
			int us = stmt.executeUpdate(sql);
			System.out.println(us);
//			
//			while(rs.next()) {
//				String us_Id = rs.getString("UI_ID");
//				String us_Pw = rs.getString("UI_PWD");
//				String us_Name = rs.getString("UI_NAME");
//				String us_Num = rs.getString("UI_NUM");
//					
//				 
//				System.out.println(us_Id +" "+us_Pw+" "+us_Name+" "+us_Num );
//				
//				
//			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
