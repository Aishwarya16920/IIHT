package lambdaExpression;

import java.util.ArrayList;

public class RemoveOddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
        arr.add("Delhi");
        arr.add("Bangalore");
        arr.add("Pune");
        arr.add("Hyderabad");
        arr.removeIf(i -> i.length() %2 != 0);
        System.out.println(arr);
	}

}
