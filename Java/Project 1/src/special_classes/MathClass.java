package special_classes;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 200;
		
		//Min & Max 
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		
		//PI & E
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//Pow, Sqrt, & Cbrt
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.sqrt(200));
		System.out.println(Math.cbrt(300));
		
		//Ceil, Floor, & Round
		double x = 12.98;
		double y = 10.24;
		System.out.println(Math.ceil(x));
		System.out.println(Math.ceil(y));
		System.out.println(Math.floor(x));
		System.out.println(Math.floor(y));
		System.out.println(Math.round(x));
		System.out.println(Math.round(y));
		
		//Sin, Cos, Tan, Log10
		
		//Random
		System.out.println(Math.random());
	}

}
