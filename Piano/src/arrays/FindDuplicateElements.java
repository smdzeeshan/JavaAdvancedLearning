package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElements {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2, 65, 344, 21, 134, 21, 4, 543, 5332, 21, 0, 0, 1, 2, 32, 65, 5332 };
		List<Integer> list = new ArrayList<>();

		System.out.print("Duplicate elements in the Array are: ");

		for (int i = 0; i < arr.length; i++) {

			if (list.contains(i))
				continue;

			int element = arr[i];
			int occr = 0;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == element) {
					occr++;
					list.add(j);
				}
			}

			if (occr >= 1)
				System.out.print(element + " ");

		}

		// System.out.println(list);

	}
}
