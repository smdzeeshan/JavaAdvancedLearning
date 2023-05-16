package arrays;

import java.util.Arrays;

public class RemoveElement_Revise {
	public static void main(String[] args) {

		int[] num = new int[] { 1, 3, 4, 2, 1 };
		int[] temp = new int[num.length - 1];

		for (int i = 0, k = 0; i < num.length; i++) {

			if (num[i] == 3)
				continue;

			temp[k] = num[i];
			k++;

		}

		System.out.println(Arrays.toString(temp));
	}
}
