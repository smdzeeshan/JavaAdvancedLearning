package mac.hashmap_Vs_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("a", 1);
		hashMap.put(null, -1);
		System.out.println(hashMap);
	}

}
