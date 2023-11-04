package lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(16);
		num.add(1);
		num.add(23);
		
		num.stream().sorted().forEach(x -> {
			System.out.println(x);
		});
		
		num.stream().sorted().forEach(System.out::println);
	}

}
