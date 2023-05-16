package arrays;

public class QuicklyFindMultipleLeftRotationsOfAnArray {
	// https://www.geeksforgeeks.org/quickly-find-multiple-left-rotations-of-an-array

	public static void main(String[] args) {
		int num[] = { 1, 3, 5, 7, 9 };
		int temp[] = new int[num.length * 2];

		preprocess(num, temp);

		int k = 2;
		leftrotation(num, temp, k);

		k = 3;
		leftrotation(num, temp, k);

		k = 4;
		leftrotation(num, temp, k);
	}

	private static void leftrotation(int[] num, int[] temp, int k) {

		int start = k % num.length;

		for (int m = start; m < start + num.length; m++) {
			System.out.print(temp[m] + " ");

		}
		System.out.println();
	}

	private static void preprocess(int[] num, int[] temp) {

		for (int i = 0; i < num.length; i++) {
			temp[i] = temp[i + num.length] = num[i];
		}
	}

}
