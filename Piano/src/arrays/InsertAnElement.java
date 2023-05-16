package arrays;

import java.util.Arrays;

public class InsertAnElement {
	public static void main(String[] args) {
		int element = 100;
		int index = 4;

		int num[] = new int[] { 2, 3, 5, 6, 7 };

		int arr[] = new int[num.length + 1];

		for (int i = 0, k = 0; i < num.length; i++, k++) {

			if (index >= num.length) {
				System.out.println("Out of range");
				break;
			}

			if (i == index) {
				arr[index] = element;
				arr[index + 1] = num[i];
				k++;
				continue;

			}

			arr[k] = num[i];

		}

		System.out.println(Arrays.toString(arr));
	}
}
