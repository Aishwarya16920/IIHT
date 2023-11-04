package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void test1() {
		int[] numbers = {1,12,3,4};
		int [] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void test2() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout = 100)
	public void test3() {
		int[] numbers = {1,23,16};
		for(int i = 1; i <= 1000000; i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}
		
	}
	
	
}
