package arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 2, 4, 2, 4, 4, 4, -1, -1, 0, 0, 432, 324, 432 };

//		ZERO IS COMING AT THE END OF THE NEW UNIQUE ELEMENT ARRAY

//		int[] temp = new int[arr.length];
//		int k = 0;
//		for (int i = 0; i < arr.length; i++) {
//			int occr = 0;
//			for (int j = 0; j < temp.length; j++) {
//				if (temp[j] == arr[i])
//					occr++;
//			}
//			
//			if (occr == 0) {
//				temp[k] = arr[i];
//				k++;
//			}
//			 
//		}
//		
//		System.out.println(Arrays.toString(temp));

		Arrays.sort(arr);

		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}

		}

		temp[j] = arr[arr.length - 1];

		// copying actual elements from temp to arr

		arr = new int[j + 1];

		for (int i = 0; i <= j; i++) {
			arr[i] = temp[i];
		}

		System.out.println("After removing duplicate elements in arr: " + Arrays.toString(arr));

	}

}