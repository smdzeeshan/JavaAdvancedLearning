package arrays;

import java.util.Arrays;

public class SegregateEvenOrOdd {

	public static void main(String[] args) {

		int[] num = { 1, 3, 2, 4, 7, 6, 9, 10 };
		int m = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				int temp = num[i];
				num[i] = num[m];
				num[m] = temp;

				m++;
			}

		}

		System.out.println(Arrays.toString(num));

	}

}
