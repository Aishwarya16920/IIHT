package multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("serial")
public class BouncingBall extends Frame implements Runnable {
	
	int y1 = 400, y2 = 400, y3 = 400;
	public BouncingBall() {
		super("Ball Game");
		Thread t1 = new Thread(this);
		t1.setName("REDBALL");
		t1.start();
		Thread t2 = new Thread(this);
		t2.setName("GREENBALL");
		t2.start();
		Thread t3 = new Thread(this);
		t3.setName("BLUEBALL");
		t3.start();
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	boolean flag=false;	
	
	ReentrantLock lock = new ReentrantLock(true);
	Condition cond=lock.newCondition();
	public void waitThread() throws InterruptedException { 
		if(lock.tryLock(5000, TimeUnit.MILLISECONDS)){ 
			try { 
				if(flag==false)
					cond.await();
				if(flag==true)
					cond.signalAll(); 
			}
			finally {
				lock.unlock(); 
			} 
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame b = new BouncingBall();
		b.setSize(600, 600);
		b.setBackground(Color.CYAN);
		b.setVisible(true);
	}

	@Override
	public void run() {
		Thread currentThread= Thread.currentThread();
		if(currentThread.getName().equals("REDBALL")){
			for(;;){
				do {
					y1=y1-10;
					repaint();
				
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while (y1>=50);
				flag=false;
				try {
					waitThread();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				do {
					y1=y1+10;
					repaint();
				
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while (y1<=400);
				flag=false;
				try {
					waitThread();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}}
			else if(currentThread.getName().equals("GREENBALL")){
				for(;;){
					do {
						y2=y2-5;
						repaint(); 
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} while (y2>=50);
					flag=false;
					try {
						waitThread();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					do {
						y2=y2+5;
						repaint(); 
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} while (y2<=400);
					flag=false;
					try {
						waitThread();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}}
			else if(currentThread.getName().equals("BLUEBALL")){
					for(;;){
						do {
							y3=y3-3;
							repaint();
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						} while (y3>=50);
						flag=true;
						try {
							waitThread();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						do {
							y3=y3+3;
							repaint();
				
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						} while (y3<=400);
						flag=true;
						try {
							waitThread();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			}
		}
	}
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.fillOval(100, y1, 50, 50);
			g.setColor(Color.GREEN);
			g.fillOval(200, y2, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(300, y3, 50, 50);
		}
}

