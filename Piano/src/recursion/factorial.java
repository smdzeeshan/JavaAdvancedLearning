package recursion;

public class factorial {

	public static void main(String[] args) {

		System.out.println(fact(6));

	}

	private static int fact(int i) {

		if (i <= 1)
			return 1;

		int res = i * fact(i - 1);

		return res;

	}

}
