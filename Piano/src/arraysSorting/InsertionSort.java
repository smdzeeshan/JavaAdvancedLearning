package arraysSorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] num = new int[10000000];

		for (int m = 0; m < num.length; m++) {
			num[m] = rand.nextInt(10000);
		}

		System.out.println("User array is : " + Arrays.toString(num));
		System.out.println("Length: " + num.length);
		System.out.println("Using Insertion sort");
		int j = 0;
		for (int i = 1; i < num.length; i++) {
			int current = num[i];

			for (j = i - 1; j >= 0 && current < num[j]; j--) {
				num[j + 1] = num[j];

			}

			num[j + 1] = current;
		}

		System.out.println(Arrays.toString(num));
	}
}
