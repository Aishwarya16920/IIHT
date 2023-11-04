package lambdaExpression;

public class ArithmeticOperations {
	@FunctionalInterface
	interface add{
	    void add(int num1,int num2);
	}
	@FunctionalInterface
	interface sub{
	    void sub(int num1,int num2);
	}
	@FunctionalInterface
	interface multi{
	    void multi(int num1,int num2);
	}
	@FunctionalInterface
	interface div{
	    void div(int num1,int num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add a = (num1, num2)->{
            System.out.println(num1 + num2);
        };

        sub s = (num1, num2) -> {
            System.out.println(num1 - num2);
        };
        multi m = (num1, num2) -> {
            System.out.println(num1 * num2);
        };

        div d = (num1 , num2) -> {
            System.out.println(num1 / num2);
        };
        a.add(16,5);
        s.sub(16,5);
        m.multi(16,5);
        d.div(16,5);
	}

}
