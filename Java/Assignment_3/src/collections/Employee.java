package collections;

import java.util.HashMap;

@SuppressWarnings("unused")
public class Employee {
	
	private int id;
	private String name;
	
	public Employee(String name, int id) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 16;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Aishu", 16);
		Employee e2 = new Employee("Akshay", 23);
		HashMap<Employee,Integer> map = new HashMap<>();
		map.put(e1,1);
		map.put(e2,2);
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
	}

}
