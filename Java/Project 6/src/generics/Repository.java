package generics;

public class Repository {
	
	private Object value;
	
	public Repository(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}
	
	public String toString() {
		return String.format("Repository conatains: %s of type: %s", value, value.getClass());
	}

}
