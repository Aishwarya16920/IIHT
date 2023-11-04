package oops_concepts;

public class Employee {
	
	String empName = "abc";
	int empID = 100;
	int empSalary = 1000;
	
	public void displayEmployeeBonus() {
		System.out.println("Employee " + empName + " gets the bonus of " + (empSalary * 0.20));
	}

}
