package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java");
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO";
			
			
			
		} catch (Exception e) {
			
		}
	}
}
