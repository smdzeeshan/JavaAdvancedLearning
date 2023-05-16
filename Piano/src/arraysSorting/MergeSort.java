package arraysSorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void conquer(int[] arr, int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1];
		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;

		while (idx1 <= mid && idx2 <= ei) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}

		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}

		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}

	}

	public static void divide(int[] arr, int si, int ei) {

		if (si >= ei)
			return;

		int mid = si + (ei - si) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		conquer(arr, si, mid, ei);
	}

	public static void main(String[] args) {

		Random rand = new Random();
		int[] arr = new int[10000];

		for (int m = 0; m < arr.length; m++) {
			arr[m] = rand.nextInt(10000);
		}

		System.out.println("User array is : " + Arrays.toString(arr));
		System.out.println("Length: " + arr.length);

		int n = arr.length;
		divide(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));

	}
}