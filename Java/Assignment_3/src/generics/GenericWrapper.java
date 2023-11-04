package generics;

public class GenericWrapper<T>{
	T obj;
	GenericWrapper(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
	
	
	public static void main(String[] args) {
		GenericWrapper<Integer> obj1 = new GenericWrapper<>(16);
		System.out.println(obj1.getObject());
		
		GenericWrapper<String> obj2 = new GenericWrapper<>("Aishu");
		System.out.println(obj2.getObject());

	}

}
