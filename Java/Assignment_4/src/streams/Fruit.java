package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String name; 
	private int calories; 
	private int price; 
	private String color;
	
	public Fruit(String name, int calories, int price, String color) {
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1 = new Fruit("Apple", 65, 100, "Green");
		Fruit f2 = new Fruit("Watermelon", 45, 200, "Red");
		Fruit f3 = new Fruit("Mango", 135, 150, "Yellow");
		Fruit f4 = new Fruit("Banana", 60, 50, "Yellow");
		Fruit f5 = new Fruit("Strawberries", 77, 180, "Red");
		Fruit f6 = new Fruit("Apple", 65, 100, "Red");
		
		 List<Fruit> arr = new ArrayList<>();
		 arr.add(f1);
		 arr.add(f2);
		 arr.add(f3);
		 arr.add(f4);
		 arr.add(f5);
		 arr.add(f6);
		 
		 System.out.println("Fruits with Low Calories (Calories < 100): ");
		 arr.stream().filter(i->i.getCalories()<100).map(i->i.getName()).forEach(System.out::println);
		 System.out.println();
		 
		 HashSet<String> set =  new HashSet<>();
	     List<String> colour =  arr.stream().map(i->i.getColor()).collect(Collectors.toList());
	     set.addAll(colour);
	     List<String> col = new ArrayList<>();
	     col.addAll(set);
	     System.out.println(set);
	     for (int j = 0; j <col.size() ; j++) {
            int k = j;
            System.out.println("Colour of the fruits : "+ col.get(j));
            arr.stream().filter(i->i.getColor().equals(col.get(k))).forEach(System.out::println);
            System.out.println();
	     }
	     
	     
	     List<Fruit> redFruits=  arr.stream().filter(i->i.getColor().equals("Red")).collect(Collectors.toList());
	     Comparator<Fruit> comp = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o1.getPrice()>o2.getPrice())return 1;
                else if (o1.getPrice()<o2.getPrice()) return -1;
                return 0;
            }
	     };
         redFruits.sort(comp);
         System.out.println(redFruits);
	 
	}

}
