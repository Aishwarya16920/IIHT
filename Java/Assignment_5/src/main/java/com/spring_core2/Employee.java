package com.spring_core2;

public class Employee {
	private String empName;
	private int empSal;
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getEmpSal() {
		return empSal;
	}
	
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	public void init() throws Exception
	{
		System.out.println("Bean Employee has been instantiated");
	}
	
	public void destroy() throws Exception
	{
		System.out.println("Container has been closed");
	}

}
