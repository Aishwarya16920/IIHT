package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayList = new ArrayList();
		
		System.out.println("ArrayList class: " + arrayList.getClass());
		
		System.out.println();
		
		System.out.println("ArrayList instanceof List: " + (arrayList instanceof List));
		System.out.println("ArrayList instanceof Collection: " + (arrayList instanceof Collection));
		System.out.println("ArrayList instanceof Iterable: " + (arrayList instanceof Iterable));
		
		System.out.println();
		
		arrayList.add("EUR");
		arrayList.add("USD");
		arrayList.add("GBP");
		arrayList.add("JPY");
		arrayList.add("INR");
		
		arrayList.remove("EUR");
		
		
		System.out.println("ArrayList initial contents: " + arrayList);
		System.out.println("ArrayList Size: " + arrayList.size());
		System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());
		System.out.println("ArrayList Contains: " + arrayList.contains("INR"));
		
		
		
	}

}
