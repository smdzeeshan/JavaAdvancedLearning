package arrays;

import java.util.Arrays;

public class Move0ToEnd {

	public static void main(String[] args) {
		int[] num = { 0, 0, 2, 3, 0, 5, 1 };

		approach1(num);
		System.out.println();

		approach2(num);

	}

	private static void approach2(int[] num) {
		System.out.println("Using approach 2 -- using single array");

		int i = 0;
		for (int j = 0; j < num.length;) {
			if (num[j] == 0) {
				j++;
			}

			else {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				j++;
				i++;

			}

		}

		while (i < num.length) {
			num[i] = 0;
			i++;
		}

		System.out.println(Arrays.toString(num));

	}

	private static void approach1(int[] num) {

		System.out.println("Using approach 1 -- creation of a new array");
		int temp[] = new int[num.length];

		int j = temp.length - 1;
		int k = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				temp[j] = num[i];
				j--;

			} else if (num[i] != 0) {
				temp[k] = num[i];
				k++;
			}
		}

		System.out.println(Arrays.toString(temp));

	}

}
