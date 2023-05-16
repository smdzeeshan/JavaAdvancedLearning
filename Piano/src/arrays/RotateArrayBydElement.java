package arrays;

import java.util.Arrays;

public class RotateArrayBydElement {
	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;

		UsingTempArray(num, d);
		RotateOneByOne(num, d);
		UsingReversalAlgorithm(num, d);

	}

	private static void Reverse(int[] arr, int start, int end) {
		int x = end;

		for (int m = start; m < x; m++) {
			int temp = arr[m];
			arr[m] = arr[x];
			arr[x] = temp;
			x--;
		}

	}

	private static void UsingReversalAlgorithm(int[] num, int d) {

		System.out.println("Using Reversal Algorithm");
		int[] new_num = num.clone();

		Reverse(new_num, 0, d - 1);
		Reverse(new_num, d, new_num.length - 1);
		Reverse(new_num, 0, new_num.length - 1);

		/*
		 * for (int i = 0; i < d-1; i++) { int temp = new_num[i]; new_num[i] =
		 * new_num[i+1]; new_num[i+1] = temp;
		 * 
		 * }
		 * 
		 * int x = new_num.length-1; for (int m = d; m < new_num.length && m < x; m++) {
		 * int temp = new_num[m]; new_num[m] = new_num[x]; new_num[x] = temp; x--; }
		 * 
		 * int b = new_num.length-1; for (int a = 0; a < new_num.length && a < b; a++) {
		 * int temp = new_num[a]; new_num[a] = new_num[b]; new_num[b] = temp; b--; }
		 */

		System.out.println(Arrays.toString(new_num));

	}

	private static void RotateOneByOne(int[] num, int d) {

		System.out.println("Using approach 'RotateOneByOne' ");

		int new_num[] = num.clone();

		int temp = 0;
		int iteration = 0;
		while (iteration < d) {
			temp = new_num[0];
			for (int m = 0; m < new_num.length; m++) {

				if (m == new_num.length - 1) {
					new_num[m] = temp;
					break;
				}

				new_num[m] = new_num[m + 1];
			}
			iteration++;
		}

		System.out.println(Arrays.toString(new_num));

	}

	private static void UsingTempArray(int[] num, int d) {

		int[] new_num = num.clone();

		System.out.println("Using approach of creating a temp array (copying d elements and n-d elements)");
		int j = new_num.length - 1;

		int[] temp = new int[new_num.length];

		for (int i = d - 1; i >= 0; i--) {
			temp[j] = new_num[i];
			j--;
		}

		int k = 0;
		for (int m = d; m < new_num.length; m++) {
			temp[k] = new_num[m];
			k++;
		}

		System.out.println(Arrays.toString(temp));
	}
}
