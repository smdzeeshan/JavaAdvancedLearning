package mac.queueLearning;

public class Queue {
	int front = -1;
	int rear = 0;
	int capacity;
	int[] queue;

	public Queue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		// System.out.println("Initializing queue of size " + capacity);
	}

	public Queue() {
		// System.out.println("Creating array of default size 5");
		this.capacity = 5;
		this.queue = new int[capacity];
	}

	public void push(int element) {

		if (isFull()) {
			System.out.println("Queue is full. Push didn't happen");
			return;
		}

		front = front + 1;
		queue[front] = element;
		System.out.println(queue[front] + " is pushed onto queue");

	}

	public void pop() {
		if (!isEmpty()) {
			// System.out.println(queue[rear] + " is poped from queue");
			rear = rear + 1;
		} else
			System.out.println("queue is empty");
	}

	public boolean isFull() {
		if (front >= queue.length - 1)
			return true;

		return false;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public void peek() {
		if (!isEmpty()) {
			System.out.println("Element at front of the queue is : " + queue[front]);
			return;
		}

		System.out.println("Queue is empty");
	}

	public void size() {
		System.out.println("Size of array is " + (front - rear + 1));
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("No elements inserted in the array");
			return;
		}
		System.out.println("Printing array elements.");
		for (int i = rear; i <= front; i++)
			System.out.println(queue[i]);
		System.out.println("End printing array elements.");

	}
}
