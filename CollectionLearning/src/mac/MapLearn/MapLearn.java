package mac.MapLearn;

import java.util.HashMap;
import java.util.Map;

public class MapLearn {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Zeeshan");
		map.put(2, "Java");
		map.put(3, "Rahul");

		for (String k : map.values())
			System.out.println(k);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}
}
