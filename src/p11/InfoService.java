package p11;

import java.util.List;
import java.util.Map;

public class InfoService {
	public List<Map<String, String>> getInfo() {
		InfoRepository info = new InfoRepository();
		return info.getInfo();
	}

	public int insertValue(Map<String, String> map) {
		InfoRepository repo = new InfoRepository();
		return repo.insertData(map);
	}

	public int deleteValue(Map<String, String> map) {
		InfoRepository repo = new InfoRepository();
		return repo.deleteData(map);
	}
}
