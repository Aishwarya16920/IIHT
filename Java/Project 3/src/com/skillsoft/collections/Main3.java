package com.skillsoft.collections;

import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] companies = {"Amazon", "Google", "Microsoft", "Facebook"};
		System.out.println("Array Contents: " + Arrays.toString(companies));
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.format("companies[%d]: %s ", i, companies[i]);
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < companies.length; i++) {
			System.out.format("companies[%d]: %s ", i, companies[i]);
			System.out.println();
		}
		
		System.out.println();
		
		for(String x : companies) {
			System.out.format("companies: %s ", x);
			System.out.println();
		}
		
		System.out.println();
		
		Object [] arr = {"Amazon", 100.0f, 23, true};
		
		System.out.println("Array Contents: " + Arrays.toString(arr));
		
		System.out.println();
		
		for(Object x: arr) {
			System.out.format("element class: %s", x.getClass());
			System.out.println();
			
			System.out.format("element: %s", x);
			System.out.println();
		}
		
	}

}
