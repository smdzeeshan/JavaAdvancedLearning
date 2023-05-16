package arrays;

public class PrintGrid {
	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("- ");
			}

			Thread.sleep(500);
			System.out.println();
		}
	}
}
