package mac.setLearn;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetLearn {
	public static void main(String[] args) {
		Set<Integer> integers = new LinkedHashSet<>();
		integers.add(2);
		integers.add(3);
		integers.add(22);
		integers.add(null);
		integers.add(null);
		System.out.println(integers.toString());

	}
}
