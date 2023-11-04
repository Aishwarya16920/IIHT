package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("lion");
		list.add("tiger");
		UnaryOperator<String> unaryOperator = word-> word.toUpperCase(); 
		list.replaceAll(unaryOperator);
		System.out.println(list);
	}

}
