package arrays;

import java.util.Arrays;

public class FindSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 3, 2, 3, -1, 0, -110001, -11, 22, 00, 93, 919, -909, -2, -0 };

		System.out.println("Actual element is " + Arrays.toString(num));

		int smallest = 0;
		int res = -1;

		for (int i = 0; i < num.length; i++) {
			if (num[i] < num[smallest]) {
				res = smallest;
				smallest = i;
			}

			else if (res != -1 && num[i] < num[res]) {
				res = i;
			}
		}
		if (res == -1)
			System.out.println("no second smallest");
		else
			System.out.println("Smallest element is: " + num[res]);

	}
}
