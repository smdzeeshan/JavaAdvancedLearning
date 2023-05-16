package arrays;

public class FindLargest3Elements {

	public static void main(String[] args) {

		int num[] = { 100, 98, 99, 101, 105, 200, -1, 10, 5, 600, 999, -9991, 1000, };

		int largest = num[0];
		int seclargest = Integer.MIN_VALUE;
		int thirdlargest = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {
			if (largest < num[i]) {
				if (seclargest != -1) {
					thirdlargest = seclargest;
				}
				seclargest = largest;
				largest = num[i];

			}

			if (largest > num[i]) {
				if (seclargest < num[i]) {
					thirdlargest = seclargest;
					seclargest = num[i];
				}

				else if (seclargest > num[i] && thirdlargest < num[i]) {
					thirdlargest = num[i];
				}
			}

		}

		System.out.println(
				"Largest= " + largest + " " + "Second Largest= " + seclargest + " " + "Third Largest= " + thirdlargest);
	}

}
