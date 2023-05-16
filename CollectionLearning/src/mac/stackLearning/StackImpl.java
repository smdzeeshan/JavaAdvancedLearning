package mac.stackLearning;

public class StackImpl {
	int top = -1;
	int capacity;
	int[] stackImpl;

	public StackImpl(int capacity) {
		this.capacity = capacity;
		this.stackImpl = new int[capacity];
	}

	public StackImpl() {
		System.out.println("Creating array of default size 5");
		this.capacity = 5;
		this.stackImpl = new int[capacity];
	}

	public void push(int element) {

		if (isFull()) {
			System.out.println("Stack is full. Push didn't happen");
			return;
		}

		top = top + 1;
		stackImpl[top] = element;
		System.out.println(stackImpl[top] + " is pushed onto stack");

	}

	public void pop() {
		if (!isEmpty()) {
			System.out.println(stackImpl[top] + " is poped from stack");
			top = top - 1;
		} else
			System.out.println("Stack is empty");
	}

	public boolean isFull() {
		if (top >= stackImpl.length - 1)
			return true;

		return false;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void peek() {

		if (!isEmpty()) {
			System.out.println("Element at top of the stack is : " + stackImpl[top]);
			return;
		}

		System.out.println("Stack is empty");
	}

	public void size() {
		System.out.println("Size of array is " + (top + 1));
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("No elements inserted in the array");
			return;
		}
		System.out.println("Printing array elements.");
		for (int i = top; i >= 0; i--)
			System.out.println(stackImpl[i]);
		System.out.println("End printing array elements.");

	}

}
