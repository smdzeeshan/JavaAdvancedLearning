package arrays;

import java.util.Arrays;

public class EvenPositionGreaterThanOddPosition {

	public static void main(String[] args) {

		int num[] = { 1, 3, 2, 2, 5 };
		approach1(num);
		approach0(num);

	}

	private static void approach0(int[] num) {

		Arrays.sort(num);

		int p = 0;
		int q = num.length - 1;
		int ans[] = new int[num.length];
		for (int i = 0; i < num.length; i++) {

			if ((i + 1) % 2 == 0) {
				ans[i] = num[q--];
			}

			else {
				ans[i] = num[p++];
			}
		}

		System.out.println(Arrays.toString(ans));

	}

	private static void approach1(int[] num) {

		for (int i = 0; i < num.length - 1; i++) {
			if (i % 2 == 0) { // even position
				if (num[i] > num[i + 1]) {
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			} else { // odd
				if (num[i] < num[i + 1]) {
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(num));
	}

}
