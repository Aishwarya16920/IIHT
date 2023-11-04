package fact;

import java.util.ArrayList;

public class Faculty {
	static ArrayList<Integer> arr = new ArrayList<>();
	
	public int getStudentMarks(int roll_no) {
		arr.add(80);
		arr.add(90);
		arr.add(60);
		arr.add(80);
		arr.add(95);
		arr.add(75);
		arr.add(70);
		arr.add(83);
		arr.add(92);
		arr.add(65);
		
		try {
			return arr.get(roll_no-1);
		}
		catch(Exception e) {
			System.out.println("Student with the below Roll Number not found!");
		}
		
		return roll_no;
	}
}