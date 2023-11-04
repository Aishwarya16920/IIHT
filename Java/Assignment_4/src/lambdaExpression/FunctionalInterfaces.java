package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaces {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // predicate interface
        arr.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
        boolean b = arr.stream().allMatch(i-> i % 2 == 0);
        System.out.println(b);

        // supplier interface
        System.out.println( arr.stream().collect(Collectors.toList()));
        
        // functional
        List<Integer> list = arr.stream().map(i-> i*2).collect(Collectors.toList());

        // consumer
        arr.stream().map(i-> i%2).forEach(System.out::println);
    }
}

