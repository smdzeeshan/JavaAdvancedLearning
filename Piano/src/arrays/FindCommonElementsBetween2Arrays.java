package arrays;

import java.util.Arrays;

public class FindCommonElementsBetween2Arrays {

	public static void main(String[] args) {

		int num[] = { 2, 3, 453, 99, 11, 22 };
		int num2[] = { 99, 11, 22, 33, 44, 2, 22, 33 };
		int temp[] = new int[5];

		int k = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num[i] == num2[j]) {
					temp[k] = num[i];
					k++;
				}

			}
		}

		System.out.println(Arrays.toString(temp));
	}

}
