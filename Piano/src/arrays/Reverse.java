package arrays;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] num = new int[] { 1, 3, 21, 5, 1, 4 };
		int[] newArr = new int[num.length];
		for (int i = num.length - 1, k = 0; i >= 0; i--, k++) {

			newArr[k] = num[i];
		}

		System.out.println(Arrays.toString(newArr));

	}
}
