package classesAndobjects;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int count;
	
	private class Node{
		private Node previous;
		private Node next;
		private int data;
		
		public Node(int data) {
			this.previous = null;
			this.next = null;
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(int val) {
		Node newNode = new Node(val);
		
		if(isEmpty()) {
			head = newNode;
		}
		
		else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		
		tail = newNode;
		count++;
	}
	
	public void insert(int val, int pos) {
		Node insertNode = new Node(val);
		
		if(pos < 1) {
			return;
		}
		
		else if(pos == 1){
			insertNode.next = head;
			head.previous = insertNode;
			head = insertNode;
		}
		
		else {
			Node temp  = new Node(0);
			temp = head;
			for(int i = 0; i <pos-2; i++) {
				if(temp != null) {
					temp = temp.next;
				}
			}
			
			if(temp != null) {
				insertNode.next = temp.next;
				insertNode.previous = temp;
				temp.next = insertNode;
				
				if(insertNode.next != null) {
					insertNode.next.previous = insertNode;
				}
				
				else {
					return;
				}
			}
			
		}
		
		count++;

	}
	
	public void delete(int pos) {
		if(head == null) {
			return;
		}
		
		else {
			Node current = head;
			for(int i = 1; i < pos; i++) {
				current = current.next;
			}
			
			if(current == head) {
				head = current.next;
			}
			
			else if(current == tail) {
				tail = tail.previous;
			}
			
			else {
				current.previous.next = current.next;
				current.next.previous = current.previous;
			}
			current = null;
			count--;
		}
	}
	
	public int count() {
		return count;
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(4);
		list.insert(3, 3);
		list.insert(0, 0);
		list.delete(2);
		int n= list.count();
		System.out.println(n);
		list.print();
	}

}
