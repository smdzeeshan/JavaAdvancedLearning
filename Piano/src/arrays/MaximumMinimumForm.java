package arrays;

import java.util.Arrays;

public class MaximumMinimumForm {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 6, 7 };

		Arrays.sort(num);

		System.out.println(Arrays.toString(num));

		int[] temp = new int[num.length];
		int k = 0;
		for (int i = 0, j = num.length - 1; i <= j; i++, j--) {

			if (i == j) {
				temp[k] = num[j];
				break;
			}

			temp[k] = num[j];
			temp[k + 1] = num[i];
			k += 2;

		}

		System.out.println(Arrays.toString(temp));
	}

}
