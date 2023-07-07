package p10;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Sgin_up {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("ID input plz : ");
		String id = s.nextLine();

		System.out.print("PW input plz : ");
		String pw = s.nextLine();
		
		System.out.print("name input plz : ");
		String name = s.nextLine();
		
		try {
			Connection con = dbCon.getCon();
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO (UI_ID, UI_PWD, UI_NAME) VALUES ('"+ id +"', '"+ pw + "', '"+name+"')";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println();
			System.out.println("Data Insert Complete");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("sql문 수정하셈");
		}
	}
}
