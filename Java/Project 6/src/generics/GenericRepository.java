package generics;

public class GenericRepository<T> {
	
	public T value;
	
	public GenericRepository(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public String toString() {
		return String.format("Repository conatains: %s", value);
	}

}
