package mac.queueLearning;

import java.util.Random;

public class TestQueue {
	public static void main(String[] args) {
		Queue obj = new Queue(10);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			obj.push(random.nextInt(100));
		}
		obj.print();
		for (int i = 0; i < 5; i++) {
			obj.pop();
		}
		obj.print();
	}
}
