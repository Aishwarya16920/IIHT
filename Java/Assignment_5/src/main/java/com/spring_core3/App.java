package com.spring_core3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2);
		Employee emp3 = (Employee) context.getBean("emp3");
		System.out.println(emp3);
		Employee emp4 = (Employee) context.getBean("emp4");
		System.out.println(emp4);
		
	}

}
