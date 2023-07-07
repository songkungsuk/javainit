package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	
	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("org.maria.jdbc.Driver");
			
		} catch (Exception e) {
			
		}
		
		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java");
			String sql = "DELETE FROM USER_INFO WHERE UI_NUM = 5";
			Statement stmt = con.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행갯수" + cnt);
		} catch (Exception e) {
			
		}
	}
}
