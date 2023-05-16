package arrays;

import java.util.ArrayList;

public class ConvertArrayToArraylist {
	public static void main(String[] args) {
		int num[] = { 2, 4, 3, 21, 4, 2, 1 };

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < num.length; i++) {
			al.add(num[i]);
		}

		System.out.println(al.toString());
	}
}
