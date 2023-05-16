package recursion;

public class LinearSearchRecursive {

	private static int search(int[] arr, int key, int index) {

		if (arr[index] == key)
			return index;

		else if (index == arr.length)
			return -1;

		else if (arr.length == 1)
			return -1;

		else
			return search(arr, key, index + 1);

	}

	public static void main(String[] args) {
		int arr[] = { 26, 99, 001, 6 };
		int key = 6;
		int startIndex = 0;
		int foundIndex = search(arr, key, startIndex);

		if (foundIndex == -1)
			System.out.println(key + " not found");
		else
			System.out.println(key + " found at index " + foundIndex);
	}

}
