package bound;

public class Box <T extends Comparable<T>>{
		// TODO Auto-generated method stub
		
		public T value;
		
		public Box(T value) {
			this.value = value;
		}
		
		public T getValue() {
			return value;
		}
		
		public void setValue(T value) {
			this.value = value;
		}
		
		public String toString() {
			return String.format("%s", value);
		}

}
