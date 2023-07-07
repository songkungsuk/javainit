package p10;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UpdateSql {
	public static void printtext(int num) {
		String one = "ID";
		String two = "NAME";
		switch (num) {
		case 1:
			System.out.println("자신의 "+ one +"를 입력해주세요.");
			break;
		case 2:
			System.out.println("자신의 "+ two +"를 입력해주세요.");
			break;
		default:
			break;
		}
		
	}
	public static String returnsql(int num, String s1, String s2) {
		switch (num) {
		case 1:
			return "UPDATE user_info SET UI_ID = '" + s1 + "' WHERE UI_ID = '"+ s2 +"'";
		case 2:
			return "UPDATE user_info SET UI_NAME = '" + s1 + "' WHERE UI_NAME = '"+ s2 +"'";
		default:
			return null;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수정하실 item [1. ID / 2. NAME ]");
		
		try {
			String num = scan.nextLine();
			printtext(Integer.parseInt(num));
			
			String textData = scan.nextLine();
			System.out.println();
			
			System.out.println("어떻게 수정하시겠습니까");
			String textData2 = scan.nextLine();
			
			try {
				Connection con = dbCon.getCon();
				Statement stmt = con.createStatement();
				String sql = returnsql(Integer.parseInt(num), textData2, textData);
				int resultCnt = stmt.executeUpdate(sql);
				System.out.println("수정 완료 " + resultCnt + " 건 ");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("쿼리문을 수정해주세요");
			}
			
			
			
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자를 입력해주세요");
		}
		
		
	}
}
