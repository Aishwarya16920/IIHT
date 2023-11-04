package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QuickTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("Before Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1 Executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 Executed");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
}
