package multithreading;

public class PingPong implements Runnable{
	
	static Thread t1;
	static Thread t2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runnable r2 = new Runnable() {
	            @Override
	            public void run() {
	                System.out.println("Pong");
	            }
	        };
        Runnable r1 = new PingPong();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

	}
	
	 @Override
	    public void run() {
	        System.out.println("Ping");
	    }
}
