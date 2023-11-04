package java_basics;

public class LoopBreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		while(a > 50) {
			a-=5;
			if(a == 80) {
				continue;
			}
			else if(a == 60) {
				break;
			}
			System.out.println(a);
		}
	}

}
