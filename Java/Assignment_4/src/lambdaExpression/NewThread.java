package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NewThread implements Runnable{
	
	Thread t;
	List<Integer> list=new ArrayList<Integer>();
	NewThread(List<Integer> list){
		t=new Thread(this);
		t.start();
		this.list=list;
	}
	public void run(){
		Consumer<Integer> consumer = (x) -> System.out.println(x);
		this.list.forEach(consumer);
	}
}
