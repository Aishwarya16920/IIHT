package classesAndobjects;

public class StackedArray {
	
	private int size;
	private int arr[];
	private int top;
	
	public StackedArray(int size){
		this.size = size;
		this.arr = new int [size];
		this.top = -1;
	}
	
	public boolean isFull() {
		return(size-1 == top);
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public void push(int num) {
		if(!isFull()) {
			top++;
			arr[top] = num;
			System.out.println("Pushed Element: " + num);
		}
		else {
			System.out.println("Stack is Full!");
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			int current = top;
			top--;
			System.out.println("Popped Element: " + arr[current]);
		}
		else {
			System.out.println("Stack is Empty!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackedArray stack = new StackedArray(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.pop();
	}

}
