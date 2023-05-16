package mac.hashmap_Vs_ConcurrentHashMap;

import java.util.Map;

public class ConcurrentHashMap {
	public static void main(String[] args) {
		Map<String, Integer> chmap = new java.util.concurrent.ConcurrentHashMap<>();
		chmap.put("a", 1);
		chmap.put("b", 2);
		chmap.put(null, 3);
		System.out.println(chmap);
	}
}
