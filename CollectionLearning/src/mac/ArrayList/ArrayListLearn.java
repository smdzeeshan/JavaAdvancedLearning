package mac.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLearn {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Zeeshan");
		list.add("Ravi Raj");
		// list.remove("Zeeshan");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println(list.get(0));
		iterator.remove();
	}
}
