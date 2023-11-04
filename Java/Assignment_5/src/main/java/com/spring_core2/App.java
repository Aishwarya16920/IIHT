package com.spring_core2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Employee emp = (Employee) context.getBean("emp1");
		System.out.println("Bean retrieved in main() method");
		System.out.println("Employee name : " + emp.getEmpName() + ", Employeesalary : " + emp.getEmpSal());
		((ConfigurableApplicationContext)context).close();;
	}

}
