package sets_maps;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product phone = new Product("iphone", "Electonics");
		Product tv = new Product("Samsung", "Electonics");
		Product shoes = new Product("Nike", "Footwear");
		Product printer = new Product("Epson", "Computer Accessories");
		
		Set <Product> set1  = new HashSet <>(); 
		
		set1.add(phone);
		set1.add(tv);
		set1.add(shoes);
		set1.add(printer);
		
		Product anotherPhone = new Product("iphone", "Electornics");
		set1.add(anotherPhone);
				
		System.out.println(set1);
		
		System.out.println(phone.equals(anotherPhone));
		System.out.println(phone.hashCode());
		System.out.println(anotherPhone.hashCode());

	}

}
