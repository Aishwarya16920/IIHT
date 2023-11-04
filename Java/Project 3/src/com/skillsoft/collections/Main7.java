package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Collection linkedList = new LinkedList();
		
		System.out.println("LinkedList class: " + linkedList.getClass());
		
		System.out.println();
		
		System.out.println("LinkedList instanceof List: " + (linkedList instanceof List));
		System.out.println("LinkedList instanceof Collection: " + (linkedList instanceof Collection));
		System.out.println("LinkedList instanceof Iterable: " + (linkedList instanceof Iterable));
		
		System.out.println();
		
		linkedList.add("EUR");
		linkedList.add("USD");
		linkedList.add("GBP");
		linkedList.add("JPY");
		linkedList.add("INR");
		
		linkedList.remove("EUR");
		
		
		System.out.println("LinkedList initial contents: " + linkedList);
		System.out.println("LinkedList Size: " + linkedList.size());
		System.out.println("LinkedList isEmpty(): " + linkedList.isEmpty());
		System.out.println("LinkedList Contains: " + linkedList.contains("INR")); 
	}

}
