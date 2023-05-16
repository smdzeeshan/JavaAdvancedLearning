package recursion;

public class AddAllNumbersInARange {

	public static void main(String[] args) {
		int result = addRange(5, 10);
		System.out.println(result);
	}

	private static int addRange(int start, int end) {
		if (end < start)
			return 0;

		int res = end + addRange(start, end - 1);

		return res;
	}
}
