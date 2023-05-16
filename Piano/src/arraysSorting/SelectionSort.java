package arraysSorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {

		int[] num = { 5, 1, 4, 2, 8, 10, -1 };

		int smallest = 0;
		for (int i = 0; i < num.length; i++) {
			smallest = i;

			for (int j = i + 1; j < num.length; j++) {
				if (num[smallest] > num[j]) {
					smallest = j;
				}
			}

			int temp = num[i];
			num[i] = num[smallest];
			num[smallest] = temp;

		}

		System.out.println(Arrays.toString(num));

	}
}
