package arraysSorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static int partition(int[] arr, int low, int high) {
		int i = low - 1;
		int pivot = arr[high];
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	static void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi - 1);
			quicksort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {

		Random rand = new Random();
		int[] arr = new int[5];

		for (int m = 0; m < arr.length; m++) {
			arr[m] = rand.nextInt(10);
		}

		System.out.println("Given array is " + Arrays.toString(arr));
		int n = arr.length;
		System.out.println("Array lenght is " + n);

		quicksort(arr, 0, n - 1);

		System.out.println("After sorting the array is ");
		System.out.println(Arrays.toString(arr));
	}
}
