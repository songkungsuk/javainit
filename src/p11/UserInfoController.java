package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInfoController {
	public List<Map<String, String>> getUserInfoList(Map<String, String> s) {
		UserInfoService getUser = new UserInfoService();
		return getUser.getUserInfo(s);
	}
	
	public int inserUserInfo(Map<String, String> userInfo) {
		UserInfoService service = new UserInfoService();
		
		return service.insertUserInfo(userInfo);
	}
	
	public int deleteUserInfo(Map<String, String> userInfo) {
		UserInfoService sev = new UserInfoService();
		
		return sev.deleteUserInfo(userInfo);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //입력객체 생성
		Map<String, String> maps = new HashMap<String, String>(); //키벨류값으로 담을 맵생성
		int input = 0; // 4가 되면 프로그램 종료
		UserInfoController user = new UserInfoController(); //컨트롤러 객체 생성 메서드가 static이 아니기 때문에
		List<Map<String, String>> canWin = user.getUserInfoList(maps); //리스트맵 생성
		while(input != 4) { // 4가아니면 무한반복
			System.out.println("데이터베이스 검색 [1] , 데이터 삽입 [2], 데이터 삭제 [3] 종료 [4]");
			input = scan.nextInt();
			if(input == 1) { //데이터 조회
				maps.put("UI_NAME", "");
				canWin = user.getUserInfoList(maps);
				
				for(Map<String, String> map : canWin) {
					System.out.print("UI_NUM : " + map.get("UI_NUM") + "\t");			
					System.out.print("UI_NAME : " + map.get("UI_NAME") + "\t");
					System.out.print("UI_ID : " + map.get("UI_ID") + "\t");
					System.out.print("UI_PWD : " + map.get("UI_PWD") + "\t");
					System.out.println();
				}
			}else if(input == 2){ //데이터 삽입
				scan.nextLine();
				System.out.println("데이터 입력 UI_NAME 입력");
				String scanner = scan.nextLine();
				maps.put("UI_NAME", scanner);
				System.out.println("데이터 입력 UI_ID 입력");
				String scanner2 = scan.nextLine();
				maps.put("UI_ID", scanner2);
				System.out.println("데이터 입력 UI_PWD 입력");
				String scanner3 = scan.nextLine();
				maps.put("UI_PWD", scanner3);
				
				int resultCnt = user.inserUserInfo(maps);
				System.out.println("변경된 컬럼수 : " + resultCnt);
		
			}
			else if(input == 3){ //데이터 삭제
				System.out.println("데이터 삭제 UI_NAME 입력");
				scan.nextLine();
				String scanner = scan.nextLine();
				maps.put("UI_NAME", scanner);
				int resultCnt = user.deleteUserInfo(maps);
				if(resultCnt != 0) {				
					System.out.println("변경된 컬럼수 : " + resultCnt);
				}
				else {
					System.out.println("이름을 제대로 입력해주세요");
				}
			}

		}
		System.out.println("프로그램 종료");
				
				
	}
}
