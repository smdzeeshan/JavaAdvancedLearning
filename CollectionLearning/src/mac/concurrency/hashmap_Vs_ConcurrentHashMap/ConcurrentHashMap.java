package mac.concurrency.hashmap_Vs_ConcurrentHashMap;

import java.util.Map;

public class ConcurrentHashMap implements Runnable {

	public static Map<String, Integer> chHashMap = new java.util.concurrent.ConcurrentHashMap<>();

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		chHashMap.put("newKey", 100);
	}

	public static void main(String[] args) throws InterruptedException {
		chHashMap.put("a", 1);
		chHashMap.put("b", 2);
		chHashMap.put("c", 2);
		chHashMap.put("d", 2);
		chHashMap.put("e", 2);
		chHashMap.put("f", 2);
		chHashMap.put("g", 2);

		Thread t1 = new Thread(new ConcurrentHashMap());
		t1.start();
		for (Map.Entry<String, Integer> entry : chHashMap.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
			Thread.sleep(500);

		}

	}
}
