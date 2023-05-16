package mac.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListLearn {
	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Zeeshan");
		linkedList.add("Khanna");
		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
