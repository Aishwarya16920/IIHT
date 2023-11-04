package inheritanceAndpolymorphism;

public class Employee {
	
	String name;
	int salary;
	
	public Employee(){
		
	}
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Aishu", 40000, 5000);
		Labour l = new Labour("Sam", 15000, 3000);
		Employee e = new Employee("Sharath", 20000);
		System.out.println("Total Salary of Employee: " + e.getSalary());
		System.out.println("Total Salary of Manager: " + m.getSalary());
		System.out.println("Total Salary of Labour: " + l.getSalary());
		
	}

}
