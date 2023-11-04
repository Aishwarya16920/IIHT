package inheritanceAndpolymorphism;

public class Labour extends Employee{

	int overtime;
	
	Labour(String name, int salary, int overtime){
		super(name, salary);
		this.overtime = overtime;
	}
	
	public int getSalary() {
		return super.getSalary() + overtime;
	}

}
