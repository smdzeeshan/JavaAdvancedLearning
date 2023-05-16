package mac.collectionSorting;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student stud) {
		if (this.getName().length() > stud.getName().length())
			return 1;
		else if (this.getName().length() < stud.getName().length())
			return -1;
		else
			return 0;
	}

}
