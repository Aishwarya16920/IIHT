package multithreading;

public class PingPongTong implements Runnable{
	
	@Override
    public void run() {
        System.out.println("Ping");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfiniteThread t3 = new InfiniteThread();
        t3.setDaemon(true);
        t3.start();
        Runnable r1 = new PingPongTong();
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("pong");
            }
        };


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

	}
	
}
