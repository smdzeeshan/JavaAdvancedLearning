package arrays;

import java.util.Arrays;

public class NumericAndStringSort {
	public static void main(String[] args) {

		int[] num = new int[] { 6, 4, 3, 5, 1, 2, 3 };

		sort(num);

	}

	private static void sort(int[] num) {

		for (int m = 0; m < num.length; m++) {
			int temp = 0;
			for (int j = m + 1; j < num.length; j++) {
				if (num[m] > num[j]) {
					temp = num[m];
					num[m] = num[j];
					num[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(num));

	}
}
