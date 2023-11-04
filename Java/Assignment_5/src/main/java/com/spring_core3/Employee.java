package com.spring_core3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int eid;
	private String ename;
	
	@Autowired
	@Qualifier("dep2")

	private Department department;
	
	public Employee() {
		
	}
	
	public Employee(int eid, String ename, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + "]";
	}

}
