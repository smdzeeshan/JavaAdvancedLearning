package mac.stackLearning;

import java.util.Random;

public class Test {
	public static void main(String[] args) {

		StackImpl impl = new StackImpl(99);
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			impl.push(random.nextInt(100));
		}
		impl.size();
		impl.peek();
		impl.pop();
		impl.size();
		impl.print();

	}
}
