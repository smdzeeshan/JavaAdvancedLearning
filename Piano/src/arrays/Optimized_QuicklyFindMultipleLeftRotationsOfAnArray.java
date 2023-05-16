package arrays;

public class Optimized_QuicklyFindMultipleLeftRotationsOfAnArray {
// https://www.geeksforgeeks.org/print-left-rotation-array/

	public static void main(String[] args) {
		int num[] = { 1, 3, 5, 7, 9 };
		int k = 2;

		for (int i = k; i < (k + num.length); i++) {
			System.out.print(num[i % num.length] + " ");
		}
	}

}
