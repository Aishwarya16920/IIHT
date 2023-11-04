package javaEnums;

@SuppressWarnings("unused")
public class Order {
	private int id;
    private int quantity;
    private String name;
    private int price;
    private Status st;

    public Order(int id, int quantity, String name, int price, Status st) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.st = st;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order od1 = new Order(0, 30, "Books", 10000, Status.NEW);
		Order od2 = new Order(1, 50, "Pens", 500, Status.ACCEPTED);
		Order od3 = new Order(2, 100, "Pencil", 200, Status.COMPLETED);
		Order od4 = new Order(3, 20, "Eraser", 200, Status.REJECTED);
		
		System.out.println(od1.st);
		System.out.println(od2.st);
		System.out.println(od3.st);
		System.out.println(od4.st);

	}

}
