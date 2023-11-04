package arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] arr = {
				{"A", "B", "C"},
				{"E", "F"},
				{"G", "H", "I", "J"}
		};
		
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
		System.out.println(arr[1][0]);
		
		arr[2][1] = "AAAA";
		System.out.println(arr[2][1]);
		
		for(String [] x : arr) {
			for(String y: x) {
				System.out.println(y);
			}
		}
		
	}

}
