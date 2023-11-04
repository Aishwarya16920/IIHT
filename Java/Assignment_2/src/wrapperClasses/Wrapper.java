package wrapperClasses;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[args.length];
		for(int i = 0; i < args.length; i++) {
			arr[i]= Integer.parseInt(args[i]);
		}
		
		int temp = 0;
		for(int i = 0; i < args.length; i++) {
			for(int j = i+1; j < args.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < args.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
