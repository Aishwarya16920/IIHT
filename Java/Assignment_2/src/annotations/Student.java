package annotations;

import java.lang.annotation.*;

@Getter(getName = "Aishu", getRoll_no = 16)
public class Student {
	
	int roll_no;
	String name;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Class c = s.getClass();
		Annotation ann = c.getAnnotation(Getter.class);
		Getter g = (Getter)ann;
		System.out.println("Roll Number: " + g.getRoll_no());
		System.out.println("Name: " + g.getName());
	}

}
