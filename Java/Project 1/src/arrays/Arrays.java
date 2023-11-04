package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		System.out.println(daysOfWeek.length);
		
		System.out.println(daysOfWeek[2]);
		
		daysOfWeek[2] = "RRR";
		System.out.println(daysOfWeek[2]);
		
		//System.out.println(daysOfWeek[10]);  Array Index Out of Bound Exception
		
		for(int i = 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
		}
		
		int [] arr1 = {1, 2, 3, 4, 5};
		
		char [] arr2 = {'a', 'e', 'i', 'o', 'u'};
	}

}
