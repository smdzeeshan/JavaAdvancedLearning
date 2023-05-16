package arrays;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {

		int num[] = { 1, 2, 4, 0, -1, -100, -500, 600, 800, 10000, 435, 5, 41, 43, 2, 1 };

		System.out.println("Actual array is " + Arrays.toString(num));
		System.out.println();

		// The approach is to traverse the array twice. In the first traversal find the
		// maximum element. In the second traversal find the greatest element in the
		// remaining excluding the previous greatest.
		approach1(num);

		// // The approach is to traverse the array once
		approach2(num);
	}

	private static void approach2(int[] num) {

		System.out.println("Using approach2");

		int largest = 0;
		int res = -1;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > num[largest]) {
				res = largest;
				largest = i;

			}

			else if (num[i] < num[largest]) {
				if (num[i] > num[res] || res == -1) {
					res = i;
				}
			}
		}

		System.out.println("second Largest= " + num[res]);

	}

	private static void approach1(int[] num) {
		System.out.println("Using approach 1");

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
		}

		int secMax = -99;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != max) {
				if (num[i] > secMax)
					secMax = num[i];
			}
		}

		System.out.println("second Largest = " + secMax);
		System.out.println();

	}
}
