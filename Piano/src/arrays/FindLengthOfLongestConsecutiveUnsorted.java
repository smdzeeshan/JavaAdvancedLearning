package arrays;

public class FindLengthOfLongestConsecutiveUnsorted {

	public static void main(String[] args) {
		int[] num = { 49, 1, 3, 200, 2, 4, 70, 5 };
		int res = 0;

		for (int i = 0; i < num.length - 1; i++) {
			int base = num[i];
			for (int j = 0; j < num.length && num[j] != base; j++) {
				if (base + 1 == num[j]) {
					res++;

				}

			}

			System.out.println(res);

		}
	}

}
