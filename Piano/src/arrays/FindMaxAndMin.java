package arrays;

public class FindMaxAndMin {

	public static void main(String[] args) {

		int[] num = new int[] { 99191, 100, 2, 5, 5, 3, 6, 8, 99, 11, 343, 432, 4324, 112, 33 };

		int max = -99, min = num[0];

		for (int i = 0; i < num.length - 1; i++) {
			if (max < num[i])
				max = num[i];

			if (num[i] < min)
				min = num[i];
		}

		System.out.println("max element is " + max);
		System.out.println("min element is " + min);

	}

}
