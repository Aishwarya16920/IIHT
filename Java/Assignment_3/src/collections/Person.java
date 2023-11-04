package collections;

import java.util.TreeSet;

public class Person implements Comparable<Person> {
	private String name;
	private int height;
	private int weight;
	
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return "Person[Name = " + name + ", Height = " +  height + ", Weight = " + weight + "]"; 
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.weight > o.weight) {
			return 1;
		}
		else if(this.weight < o.weight) {
			return -1;
		}
		else if(this.weight == o.weight) {
			if(this.height > o.height) {
				return 1;
			}
			else if(this.height < o.height) {
				return -1;
			}
			else {
				return 0;
			}
		}
		
		return 0;
	}
	
	public static void main(String [] args) {
		Person p1 = new Person("Shyam", 170, 65);
		Person p2 = new Person("Jack", 183, 73);
		Person p3 = new Person("Zara", 154, 50);
		Person p4 = new Person("Harsh", 160, 50);
		
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
	}
	
}
