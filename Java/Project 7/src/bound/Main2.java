package bound;

public class Main2 {
	
	private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2){
		if(box1.getValue().compareTo(box2.getValue()) > 0) {
			return box1;
		}
		return box2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Integer> box1 = new Box<>(22);
		System.out.println(box1);
		
		Box<Integer> box2 = new Box<>(99);
		System.out.println(box2);
		
		System.out.println(getLarger(box1, box2));
		
	}

}
