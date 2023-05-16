package arrays;

public class SumofArray {
	public static void main(String[] args) {

		int[] num = new int[] { 3, 2, 1, 3 };
		int sum = 0;

		for (int m : num)
			sum += num[m];

		System.out.println(sum);

	}
}
