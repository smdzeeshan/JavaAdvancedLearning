package arraysSorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] num = new int[100];

		for (int m = 0; m < num.length; m++) {
			num[m] = rand.nextInt(10000);
		}

		System.out.println("User array is : " + Arrays.toString(num));
		System.out.println("Length: " + num.length);

		boolean swapped;

		System.out.println("Using Bubble Sort");

		for (int i = 0; i < num.length - 1; i++) {
			swapped = false;

			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {

					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false)
				break;

		}
		System.out.println(Arrays.toString(num));

	}

}
