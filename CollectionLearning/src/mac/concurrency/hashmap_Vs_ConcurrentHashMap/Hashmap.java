package mac.concurrency.hashmap_Vs_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap implements Runnable {

	public static Map<String, Integer> hashMap = new HashMap<>();

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		hashMap.put("newKey", 100);
	}

	public static void main(String[] args) throws InterruptedException {
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 2);
		hashMap.put("d", 2);
		hashMap.put("e", 2);
		hashMap.put("f", 2);
		hashMap.put("g", 2);
		Hashmap hashmap = new Hashmap();
		Thread t1 = new Thread(hashmap);
		t1.start();
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
			Thread.sleep(500);

		}

	}
}
