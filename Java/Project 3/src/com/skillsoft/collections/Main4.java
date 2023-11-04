package com.skillsoft.collections;

import java.util.Arrays;

public class Main4 {

	private static String [] arr = new String [5];
	private static int lastIndex = 0;
	
	private static void addString(String element) {
		if(lastIndex >= arr.length) {
			System.out.println("Cannot add element!");
			return;
		}
		arr[lastIndex++] = element;
	}
	
	private static void delString(int index) {
		if(index >= arr.length) {
			System.out.println("Cannot del element!");
			return;
		}
		arr[index] = null;
		
		int currentIndex = index;
		
		for(int i = currentIndex; i < arr.length - 1; i++) {
			arr[currentIndex] = arr[currentIndex + 1];
			currentIndex++;
		}
		lastIndex--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addString("amazon");
		addString("skillsoft");
		addString("zensar");
		addString("suzuki");
		
		System.out.println("ArrayContents: " + Arrays.toString(arr));
		
		delString(0);
		System.out.println("ArrayContents: " + Arrays.toString(arr));
		
	}

}
