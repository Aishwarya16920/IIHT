package classesAndobjects;

public class QueuedArray {
	
	private int size;
	private int arr[];
	private int front;
	private int rear;
	int current = 0;
	
	public QueuedArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.front = 0;
		this.rear = -1;
	}
	
	public boolean isFull() {
		return(size-1 == current);
	}
	
	public boolean isEmpty() {
		return(current == 0);
	}
	
	public void enqueue(int num) {
		if(!isFull()) {
			rear++;
			if(rear == size-1) {
				rear = 0;
			}
			arr[rear] = num;
			current++;
			System.out.println("Added Element: " + num);
		}
		else {
			System.out.println("Queue is Full!");
		}
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			front++;
			if(front == size-1) {
				System.out.println("Removed Element: " + arr[front - 1]);
				front = 0;
			}
			else {
				System.out.println("Removed Element: " + arr[front - 1]);
			}
			current--;
		}
		else {
			System.out.println("Queue is Empty!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueuedArray queue = new QueuedArray(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.dequeue();
		queue.dequeue();
		
	}

}
