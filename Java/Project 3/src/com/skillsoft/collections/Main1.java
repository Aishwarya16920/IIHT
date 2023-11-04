package com.skillsoft.collections;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = new int [4];
		
		arr1[0] = 10;
		arr1[1] = 20;
		
		System.out.println("Array of integers: " + arr1);
		System.out.println("getClass() representation: " + arr1.getClass());
		System.out.println("toString() representation: " + arr1.toString());
		
		System.out.println();
		
		System.out.println("toString() representation: " + Arrays.toString(arr1));
		
		System.out.println();
		
		float [] arr2 = new float [6];
		
		arr2[0] = 10.5f;
		arr2[3] = 20.5f;
		
		System.out.println("Array of integers: " + arr2);
		System.out.println("getClass() representation: " + arr2.getClass());
		System.out.println("toString() representation: " + arr2.toString());
		
		System.out.println();
		
		System.out.println("toString() representation: " + Arrays.toString(arr2));
		
		System.out.println();
		
		String [] arr3 = new String [7];
		
		arr3[1] = "Good";
		arr3[2] = "Morning";
		
		System.out.println("Array of integers: " + arr3);
		System.out.println("getClass() representation: " + arr3.getClass());
		System.out.println("toString() representation: " + arr3.toString());
		
		System.out.println();
		
		System.out.println("toString() representation: " + Arrays.toString(arr3));
		
		System.out.println();
	}

}
