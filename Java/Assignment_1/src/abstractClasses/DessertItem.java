package abstractClasses;

import java.util.Scanner;

public abstract class DessertItem {
	
	static int candy= 50;
	static int cookie = 30;
	static int icecream = 70;
	
	public abstract int getCost();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DessertItem d;
		Scanner s = new Scanner(System.in);
		System.out.println("What is your Role? (owner or customer)");
		String role = s.next();
		if(role.equalsIgnoreCase("owner")) {
			System.out.println("How many dessert you want to add?");
			int num= s.nextInt();
			for(int i = 0; i < num; i++) {
				System.out.println("Which dessert you want to add?");
				String dessert = s.next();
				int count = 0;
				if(dessert.equalsIgnoreCase("candy")) {
					System.out.println("Add the candy by entering the number: " );
					count = s.nextInt();
					candy += count;
					System.out.println("Your items have been added to the storage: Candy-> " + candy);
				}
				
				else if(dessert.equalsIgnoreCase("cookie")) {
					System.out.println("Add the cookie by entering the number: " );
					count = s.nextInt();
					cookie += count;
					System.out.println("Your items have been added to the storage: Cookie-> " + cookie);
				}
				
				else if(dessert.equalsIgnoreCase("icecream")) {
					System.out.println("Add the icecream by entering the number: " );
					count = s.nextInt();
					icecream += count;
					System.out.println("Your items have been added to the storage: Iceream-> " + icecream);
				}
				
				else {
					System.out.println("No dessert found with that name!");
				}
			}

		}
		
		else if(role.equalsIgnoreCase("customer")) {
			System.out.println("How many desserts you want to order?");
			int num = s.nextInt();
			for(int i = 0; i < num; i++) {
				int count = 0;
				System.out.println("Which dessert you would like to order?");
				String dessert = s.next();
				if(dessert.equalsIgnoreCase("candy")) {
					System.out.println("How many candies do you want?");
					count = s.nextInt();
					d= new Candy();
					int candyCost = d.getCost();
					System.out.println("Pay $" + ((candyCost * count)/60) + " to place your order");
					System.out.println("Your order has been placed");
				}
				
				else if(dessert.equalsIgnoreCase("cookie")) {
					System.out.println("How many cookies do you want?");
					count = s.nextInt();
					d= new Cookie();
					int cookieCost = d.getCost();
					System.out.println("Pay " + ((cookieCost * count)/70) + " Euros to place your order");
					System.out.println("Your order has been placed");
				}
				
				else if(dessert.equalsIgnoreCase("icecream")) {
					System.out.println("How many icecreams do you want?");
					count = s.nextInt();
					d= new Icecream();
					int icecreamCost = d.getCost();
					System.out.println("Pay Rs." + (icecreamCost * count) + " to place your order");
					System.out.println("Your order has been placed");
				}
				
				else {
					System.out.println("No dessert found with that name!");
				}
			}
		}
		
		else {
			System.out.println("Please enter the correct role!");
		}
		s.close();
	}

}
