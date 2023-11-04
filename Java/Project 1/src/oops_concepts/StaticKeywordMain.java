package oops_concepts;

public class StaticKeywordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticKeyword sk1 = new StaticKeyword();
		StaticKeyword.name= "Rob";
		sk1.age = 5;
		sk1.grade = "1st";
		sk1.displayDetails();
		
		
		StaticKeyword sk2 = new StaticKeyword();
		StaticKeyword.name= "Shyam";
		sk2.age = 9;
		sk2.grade = "3rd";
		sk2.displayDetails();
		
		StaticKeyword.doThis();	
	}

}
