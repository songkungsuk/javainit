package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = scanner.nextLine();
		System.out.println();
		System.out.print("PASSWORD : ");
		String pw = scanner.nextLine();
		
		
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO WHERE UI_ID = '"+ id + "' AND UI_PWD = '"+ pw +"'";
			ResultSet rs = stmt.executeQuery(sql);
				
			if(rs.next()) {
				String sql_Id = rs.getString("UI_NAME");
				
				System.out.println("회원이 조회 되었습니다. "+ sql_Id);
			}
			else {
					System.out.println("회원이 조회 되지 않았습니다.");
						
			}
		
			
		} catch (Exception e) {
			
		}
		
		
	}
}
