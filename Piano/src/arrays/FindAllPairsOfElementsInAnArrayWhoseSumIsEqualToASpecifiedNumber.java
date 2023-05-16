package arrays;

import java.util.ArrayList;

public class FindAllPairsOfElementsInAnArrayWhoseSumIsEqualToASpecifiedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 1, 3, 4, 5, 3, 2 };
		int sum = 4;
		ArrayList<String> al = new ArrayList<>();

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if ((num[i] + num[j]) == sum) {
					String str = Integer.toString(num[i]) + "&" + Integer.toString(num[j]);
					al.add(str);

				}

			}
		}
		System.out.println(al.toString());
	}

}
