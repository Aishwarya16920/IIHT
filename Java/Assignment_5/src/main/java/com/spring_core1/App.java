package com.spring_core1;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		int total_price = 0;
		Map<String, Order> beans = context.getBeansOfType(Order.class);
		for(Entry<String, Order> order : beans.entrySet()) {
			total_price += order.getValue().getItem().getItemPrice();
		}
		System.out.println("Total price of all orders : " + total_price);
	}

}
