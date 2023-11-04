package annotations;

import java.util.ArrayList;
import java.util.List;

public class Annotations extends SampleClass{
	
	@Override
	public void fun1() {
		System.out.println("Hello Aishu!");
		
	}
	
	@Deprecated
	public void fun2() {
		System.out.println("Deprecated!");
	}
	

	@SuppressWarnings("unchecked")
	public void fun3() {
		 @SuppressWarnings("rawtypes")
		List list = new ArrayList();
		 list.add("Aishu"); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annotations ann = new Annotations();
		ann.fun1();
		ann.fun2();
		ann.fun3();
		
	}

}
