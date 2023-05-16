package arrays;

import java.util.Arrays;

public class RemoveTheDuplicateElementsOfAGivenArrayAndReturnTheLength {

	public static void main(String[] args) {
		int num[] = { 20, 20, 30, 40, 50, 50, 50 };

		Arrays.sort(num);
//		int j = 0;
//		
//		for (int i = 0; i < num.length-1; i++) {
//			if (num[i] == num[i+1]) {
//				num[j] = num[i];
//				j++;
//				i++;
//			}
//			
//			else {
//				num[j] = num[i];
//				j++;
//			}
//		}
//		
//		int[] res = new int[j];
//		j = 0;
//		for (int x = 0; x < res.length; x++) {
//			res[x] = num[j];
//			j++;
//		}

		int i = 0;
		int[] temp = new int[num.length];
		for (int k = 0; k < num.length - 1; k++) {
			if (num[k] != num[k + 1]) {
				temp[i] = num[k];
				i++;
			}
		}

		temp[i] = num[num.length - 1];

		num = new int[i + 1];
		int length = 0;
		for (int x = 0; x <= i; x++) {
			num[x] = temp[x];
			length++;
		}

		System.out.println(Arrays.toString(num));
		System.out.println("Length is " + length);
	}

}
