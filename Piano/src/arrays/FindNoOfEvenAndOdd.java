package arrays;

import java.util.Arrays;

public class FindNoOfEvenAndOdd {
	public static void main(String[] args) {
		int num[] = { 2, 3, 4, 32, 7, 9, 100, 100 };

		// removing duplicates

		Arrays.sort(num);

		int even = 0, odd = 0;
		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {
				System.out.println(num[i] + " is even");
				even++;
			}

			else {
				System.out.println(num[i] + " is odd");
				odd++;
			}

		}

		System.out.println();
		System.out.println("No of even is: " + even);
		System.out.println("No. of odd is: " + odd);
	}
}
