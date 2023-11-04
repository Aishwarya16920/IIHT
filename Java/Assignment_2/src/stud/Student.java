package stud;

import fact.Faculty;

public class Student {
	
	private int roll_no;
	
	public Student(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(5);
		Faculty f = new Faculty();
		System.out.println(f.getStudentMarks(s.roll_no));

	}

}
