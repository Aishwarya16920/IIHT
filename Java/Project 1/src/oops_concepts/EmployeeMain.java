package oops_concepts;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.empName = "Rob";
		emp1.empID = 200;
		emp1.empSalary = 12345;
		emp1.displayEmployeeBonus();
		
		Employee emp2 = new Employee();
		emp2.empName = "Siva";
		emp2.empID = 300;
		emp2.empSalary = 98765;
		emp2.displayEmployeeBonus();
		
	}

}
