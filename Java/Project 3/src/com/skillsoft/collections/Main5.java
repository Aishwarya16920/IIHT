package com.skillsoft.collections;

import java.util.Arrays;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr1 = new int[3][4];
		
		System.out.println(Arrays.toString(arr1));
		
		arr1[0][0] = 100;
		arr1[1][1] = 200;
		arr1[2][2] = 300;
		
		for(int [] x: arr1) {
			System.out.println(Arrays.toString(x));
		}
		
		int [][][] arr2 = new int[3][4][2];
		
		System.out.println(Arrays.toString(arr2));
		
		for(int [][] x: arr2) {
			System.out.print("[");
			for(int [] y : x) {
				System.out.print(Arrays.toString(y));
			}
			System.out.println("]");
		}
		
		String [][] arr3 = new String [2][3];
		
		arr3[1][2] = "Harry";
		arr3[0][1] = "Ron";
		arr3[1][0] = "Hermione";
		
		for(String [] x : arr3) {
			System.out.println(Arrays.toString(x));
		}
		
		String [][] arr4 = new String [3][];
		
		arr4[0] = new String[2];
		arr4[1] = new String[3];
		arr4[2] = new String[4];
		
		arr4[0][0] = "Harry";
		arr4[1][1] = "Ron";
		arr4[2][2] = "Hermione";
		
		for(String [] x : arr4) {
			System.out.println(Arrays.toString(x));
		}
		
	}

}
