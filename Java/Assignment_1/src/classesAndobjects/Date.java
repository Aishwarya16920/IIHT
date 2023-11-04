package classesAndobjects;

import java.util.Scanner;

public class Date{
	
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayDate() {
		System.out.println("The Date is " + getDay()+ "-" + getMonth() + "-" + getYear());
	}
	
	public static void swapDate(Date d1, Date d2) {
		System.out.println("Before Swap: ");
		System.out.println("First Date: " + d1.day + "-" + d1.month + "-" + d1.year);
		System.out.println("Second Date: " + d2.day + "-" + d2.month + "-" + d2.year);
		
		var temp = d1;
		d1 = d2;
		d2 = temp;
		
		System.out.println("After Swap: ");
		System.out.println("First Date: " + d1.day + "-" + d1.month + "-" + d1.year);
		System.out.println("Second Date: " + d2.day + "-" + d2.month + "-" + d2.year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Day: " );
		int day1 = s.nextInt();
		System.out.println("Enter First Month: " );
		int month1 = s.nextInt();
		System.out.println("Enter First Year: " );
		int year1 = s.nextInt();
		
		Date d1 = new Date(day1,month1,year1);		
		d1.displayDate();
		
		System.out.println("Enter Second Day: " );
		int day2 = s.nextInt();
		System.out.println("Enter Second Month: " );
		int month2 = s.nextInt();
		System.out.println("Enter Second Year: " );
		int year2 = s.nextInt();
		
		Date d2 = new Date(day2,month2,year2);		
		d2.displayDate();
		
		swapDate(d1,d2);
		
		s.close();
		
		
	}

}
