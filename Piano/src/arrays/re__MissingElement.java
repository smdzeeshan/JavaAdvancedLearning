package arrays;

public class re__MissingElement {

	public static void main(String[] args) {
		int num[] = { 1, 2, 4, 7 };

		System.out.print("Missing elements are: ");
		int base = num[0];

		for (int i = 0; i < num.length - 1; i++) {

			if (base + 1 != num[i + 1]) {
				System.out.println(base + 1);
				base += 2;
				i--;
			}

			else
				base++;
		}
	}
}
