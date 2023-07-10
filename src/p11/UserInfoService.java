package p11;

import java.util.List;
import java.util.Map;

public class UserInfoService {
	public List<Map<String, String>> getUserInfo(Map<String, String> s){
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.getUserInfo(s);
	}
	
	public int insertUserInfo(Map<String, String> map) {
		UserInfoRepository repo = new UserInfoRepository();
		
		return repo.insertUserInfo(map);
	}
	
	public int deleteUserInfo(Map<String, String> map) {
		UserInfoRepository repo = new UserInfoRepository();
		return repo.deleteUserInfo(map);
	}
}
