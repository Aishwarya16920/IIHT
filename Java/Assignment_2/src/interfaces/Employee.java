package interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Printable, Sortable, Cloneable{
	
	int id;
	String name;
	int salary;
	static ArrayList<Employee> empList = new ArrayList<>();
	static ArrayList<Circle> cirList = new ArrayList<>();
	String date_of_birth;
	
	public Employee() {
	}
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public void print() {
		System.out.println("Employee Class");
	}
	
	public void printAll(Employee e) {
		System.out.println(e);
		System.out.println("Employee Details:");
		System.out.println("Id- " + id);
		System.out.println("Name- " + name);
		System.out.println("Salary- Rs." + salary);
	}
	
	public String toString() {
		return "Employee[id= " + id + ",name= " + name + ", salary= " + salary + "]";
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        if (e1.id > e2.id) {
            return 1;
        } else if (e1.id < e2.id) {
            return -1;
        } else {
            return 0;
        }
	}
	
	
	public static void sortAll() {
		Sortable emp = new Employee();
		Sortable cir = new Circle();
		
		Collections.sort(empList,emp);
		Collections.sort(cirList,cir);
		
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(100, "Aishu", 80000);
		e1.print();
		e1.printAll(e1);
		Circle c1 = new Circle(5);
		c1.print();
		c1.printAll(c1);
		
		Employee e2= new Employee(102, "Zara", 50000);
		Employee e3= new Employee(103, "Akshay", 60000);
		Employee e4= new Employee(104, "Sathish", 80000);
		
		empList.add(e2);
		empList.add(e4);
		empList.add(e1);
		empList.add(e3);
		
		System.out.println("Before sorting: " + empList);
		sortAll();
		System.out.println("After sorting: " + empList);
		
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(10);
		Circle c4 = new Circle(8);
		
		cirList.add(c1);
		cirList.add(c2);
		cirList.add(c3);
		cirList.add(c4);
		
		System.out.println("Before sorting: " + cirList);
		sortAll();
		System.out.println("After sorting: " + cirList);
		
		
		Employee e5 = new Employee("16/09/2000");
		
		//Shallow Copy
		Employee e6 = e5;
		
		Employee e7 = new Employee();
		
		//Deep Copy
		e7.date_of_birth = e5.date_of_birth;
		System.out.println("Employee 5: " + e5.date_of_birth);
		System.out.println("Employee 6: " + e6.date_of_birth);
		System.out.println("Employee 7: " + e7.date_of_birth);
		
		Employee e8 = new Employee();
		try {
			e8 = (Employee)e5.clone();
			System.out.println("Employee 8: " + e8.date_of_birth);
		} catch (CloneNotSupportedException e) {
			
		}	
	}
}


