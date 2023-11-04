package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class AggregationOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = new Integer[] {
				23, 34, 56, 21, 78, 82, 48, 100, 165, 934, 23, 78
		};
		
		Collection<Integer> collection = Arrays.asList(intArray);
		
		Stream<Integer> stream = collection.stream();
		
		System.out.println(stream.count());
		
		Stream<Integer> distinctStream = collection.stream().distinct();
		
		System.out.println(distinctStream.count());
		
		Stream<Integer> limitStream = collection.stream().limit(5);
		
		System.out.println(limitStream.count());	
		
		Stream<Integer> skipStream = collection.stream().skip(10);
		
		System.out.println(skipStream.count());
		
		Stream<Integer> sortedStream = collection.stream().sorted();
		
		System.out.println(Arrays.toString(sortedStream.toArray()));
	}
	
}