package inheritanceAndpolymorphism;

public class Manager extends Employee{
	
	int incentive;
	
	Manager(String name, int salary, int incentive){
		super(name, salary);
		this.incentive = incentive;
	}
	
	public int getSalary() {
		return super.getSalary() + incentive;
	}

}
