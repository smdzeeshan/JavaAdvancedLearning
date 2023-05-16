package mac.setLearn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetLearn {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Zeeshan");
		set.add("Ravi_Raj");
		set.add("Nilesh");
		set.add("Zeeshan");
		set.add("Ravi_Raj");
		set.add(null);

		for (String string : set)
			System.out.println(string);

		Iterator<String> iterator = set.iterator();
		do {
			System.out.println(iterator.next());
		} while (iterator.hasNext());

	}
}
