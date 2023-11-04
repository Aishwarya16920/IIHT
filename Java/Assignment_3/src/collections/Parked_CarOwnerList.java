package collections;

import java.util.HashMap;
import java.util.Map;

public class Parked_CarOwnerList {
	Map<Integer,Parked_CarOwner_Details> map = new HashMap<>();
	int token = 0;
	public void add_new_car(Parked_CarOwner_Details obj) {
		map.put(token++, obj);
		System.out.println("Car has been added!");
	}
	
	public void remove_car(int token) {
		try {
			map.remove(token);
			System.out.println("Car has been removed!");
		}
		catch(Exception e){
			System.out.println("Invalid token number, Try again!");
		}
	}
	
	public void get_parked_car_location(int token) {
		if(token >= 1 && token <= 20) {
			System.out.println("Your car is parked at First Floor 1st Section.");
		}
		
		else if(token >= 21 && token <= 40) {
			System.out.println("Your car is parked at First Floor 2nd Section.");
		}
		
		else if(token >=41 && token <= 60) {
			System.out.println("Your car is parked at First Floor 3rd Section.");
		}
		
		else if(token >=61 && token <= 80) {
			System.out.println("Your car is parked at First Floor 4th Section.");
		}
		
		else if(token >=81 && token <= 100) {
			System.out.println("Your car is parked at Second Floor 1st Section.");
		}
		
		else if(token >=101 && token <= 120) {
			System.out.println("Your car is parked at Second Floor 2nd Section.");
		}
		
		else if(token >=121 && token <= 140) {
			System.out.println("Your car is parked at Second Floor 3rd Section.");
		}
		
		else if(token >=141 && token <= 160) {
			System.out.println("Your car is parked at Second Floor 4th Section.");
		}
		
		else if(token >=161 && token <= 180) {
			System.out.println("Your car is parked at Third Floor 1st Section.");
		}
		
		else if(token >=181 && token <= 200) {
			System.out.println("Your car is parked at Third Floor 2nd Section.");
		}
		
		else if(token >=201 && token <= 220) {
			System.out.println("Your car is parked at Third Floor 3rd Section.");
		}
		
		else if(token >=221 && token <= 240) {
			System.out.println("Your car is parked at Third Floor 4th Section.");
		}
		
		else {
			System.out.println("Invalid token number, Try again!");
		}
	}
	
	public  void getParkedCarDetails() {
		System.out.println(map);
	}
}
