package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StringConsistsOfFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Cat");
		list.add("Dog");
		list.add("Lion");
		list.add("Tiger");
		StringBuilder sb=new StringBuilder();
		for(String s:list){
			sb.append(s.substring(0,1));
		}
		Consumer<StringBuilder> consumer = (StringBuilder x) -> System.out.println(x);
		consumer.accept(sb);

	}

}
