package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		// 필요한것
		// 전화기 - 네트워크 유형
		// 유심칩 - 라이브러리 - MariaDB JDBC libs
		// 전화번호 - IP주소
		// 인증절차 - 사용자 ID PWD 
		
		
		try {
			//http 처럼 주소창 -> 그리고 ip주소 : 포트번호 / 데이터베이스 이름 , 데이터베이스 아이디, 비번
			Connection conn;
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd","root", "kd1824java");
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME) \r\n"
					+ "VALUES('TEST123', 'TEST1', '연습1')";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반환된 행 개수 " + resultCnt);
			
			
			
			
		} catch (Exception e) {

		}
		
	}
}
