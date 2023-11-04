package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{
	
	String name;
	int height_in_inches;
	int weight;
	static  List<Person> personList = new ArrayList<>();
	
	Person(String name, int height_in_inches, int weight){
		this.name = name;
		this.height_in_inches = height_in_inches;
		this.weight = weight;
	}
	
	public String toString() {
		return "Person[Name= " + name + ", Height in inches= " + height_in_inches + ", Weight=" + weight + "]";
	}
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Aishu", 155, 50);
		Person p2 = new Person("Akshay", 165, 70);
		Person p3 = new Person("Sathish", 160, 60);
		Person p4 = new Person("Zara", 145, 35);
		
		personList.add(p3);
		personList.add(p1);
		personList.add(p4);
		personList.add(p2);
		
		System.out.println("Before sorting: " + personList);
		
		Collections.sort(personList);
		System.out.println("Name Based Sorting: " + personList);
		
		SortByHeight h = new SortByHeight();
		Collections.sort(personList, h);
		System.out.println("Height Based Sorting: " + personList);
		
		SortByWeight w = new SortByWeight();
		Collections.sort(personList, w);
		System.out.println("Weight Based Sorting: " + personList);
	}

}
