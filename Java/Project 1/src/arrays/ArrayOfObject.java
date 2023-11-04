package arrays;

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object [][] arr = { 
			{"Aishu", 16, 5.16, 'S'},
			{"Aksh", 23, 3.23, 'M'}
	};
		
		for(Object [] x : arr) {
			for(Object y : x) {
				System.out.print(y + " ");
			}
			System.out.print("\n");
		}
	}

}
