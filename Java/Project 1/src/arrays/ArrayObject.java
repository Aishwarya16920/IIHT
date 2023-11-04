package arrays;

public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = new int[10];
		
		arr1[1] = 20;
		arr1[3] = 200;
		arr1[5] = 2000;
		arr1[7] = 20000;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
