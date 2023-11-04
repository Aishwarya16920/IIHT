package com.skillsoft.collections;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = new int [4];
		
		arr1[0] = 10;
		arr1[1] = 20;
		
		float [] arr2 = new float [6];
		
		arr2[0] = 10.5f;
		arr2[3] = 20.5f;
		
		String [] arr3 = new String [7];
		
		arr3[1] = "Good";
		arr3[2] = "Morning";
		
		Date [] arr4 =  new Date[10];
		
		arr4[1] = Calendar.getInstance().getTime();
		arr4[2] = Calendar.getInstance().getTime();
		
		System.out.println("intArray instanceof Object: " + (arr1 instanceof Object));
		System.out.println("floatArray instanceof Object: " + (arr2 instanceof Object));
		System.out.println("stringArray instanceof Object: " + (arr3 instanceof Object));
		System.out.println("dateArray instanceof Object: " + (arr4 instanceof Object));
		
		System.out.println();
		
		System.out.println("toString() representation: " + Arrays.toString(arr1));
		System.out.println("intArray.length: " + arr1.length);
		
		System.out.println("toString() representation: " + Arrays.toString(arr2));
		System.out.println("floatArray.length: " + arr2.length);
		
		System.out.println("toString() representation: " + Arrays.toString(arr3));
		System.out.println("stringArray.length: " + arr3.length);
		
		System.out.println("toString() representation: " + Arrays.toString(arr4));
		System.out.println("dateArray.length: " + arr4.length);
		
		System.out.println();
		
		String [] companies1 = {};
		String [] otherCompanies = new String [0];
		
		System.out.println("companies.length: " + companies1.length);
		System.out.println("otherCompanies.length: " + otherCompanies.length);
		
		String [] companies2 = {"Amazon", "Google", "Microsoft", "Facebook"};
		System.out.println("Array Contents: " + Arrays.toString(companies2));
		
		System.out.println();
		
		System.out.println("Companies[0]: " + companies2[0]);
		System.out.println("Companies[1]: " + companies2[1]);
		System.out.println("Companies[2]: " + companies2[2]);
		System.out.println("Companies[3]: " + companies2[3]);
		
		System.out.println();
	}

}
