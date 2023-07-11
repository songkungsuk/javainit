package p10;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbCon {
	
	private static final String CLASS_DRIVER = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/kd";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kd1824java";
	
	
	static {
		try {
			Class.forName(CLASS_DRIVER);
			System.out.println(CLASS_DRIVER);
		} catch (Exception e) {
			
		}
	}
	
	public static Connection getCon() {
		try {
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return con;
		} catch (Exception e) {
			
		}
		return null;
	}
		public static void main(String[] args) {
			dbCon.getCon();
		}
}
