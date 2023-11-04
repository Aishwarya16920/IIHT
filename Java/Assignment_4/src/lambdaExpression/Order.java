package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int id;
    private int price;
    private String status;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amt=" + price +
                ", status='" + status + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order(int id, int price, String status) {
        this.id = id;
        this.price = price;
        this.status = status;
    }



    public int getAmt() {
        return price;
    }

    public void setAmt(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
	
    @FunctionalInterface
    interface Test{
        void displayOrder();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Order o1 = new Order(1,10000,"REJECTED");
        Order o2 = new Order(2,20000,"ACCEPTED");
        Order o3 = new Order(3,30000,"REJECTED");
        Order o4 = new Order(4,40000,"COMPLETED");
        Order o5 = new Order(5,50000,"ACCEPTED");
        List<Order> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);

        Test t = () -> {
            list.stream().filter(i-> i.getAmt()>10000).filter(i-> i.getStatus() == "ACCEPTED" || i.getStatus() == "COMPLETED").forEach(System.out::println);
        };
        t.displayOrder();
	}

}
