package arrays;

public class AverageOfArray {
	public static void main(String[] args) {

		int[] num = new int[] { 1, 4, 2, 5 };
		int sum = 0;
		for (int m : num)
			sum = sum + m;

		System.out.println("Average is " + sum / num.length);

	}
}
