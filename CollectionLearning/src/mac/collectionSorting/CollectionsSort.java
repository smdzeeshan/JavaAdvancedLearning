package mac.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsSort {
	public static void main(String[] args) {
		Student s1 = new Student("zeeshan", 20);
		Student s2 = new Student("ravi", 50);
		Student s3 = new Student("vishwajeet", 10);
		Student s4 = new Student("nilesh", 45);

		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		List<String> strings = new ArrayList<>();
		strings.add(s1.getName());
		strings.add(s2.getName());
		strings.add(s3.getName());
		strings.add(s4.getName());

		Collections.sort(strings);

		System.out.println(strings.toString());

		// sorting student objects
		Collections.sort(students, new AgeComparator());
		System.out.println(students.toString());

		Collections.sort(students, new NameComparator());
		System.out.println(students.toString());

	}
}
