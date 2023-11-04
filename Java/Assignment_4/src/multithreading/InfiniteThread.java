package multithreading;

public class InfiniteThread extends Thread{
	private boolean flag;
    @Override
    public void run() {
        while(!flag)
        func();
    }
    public void cancelflag(){
        this.flag=true;
    }
    public boolean isflagActive(){
        return flag;
    }
    public void func(){
        System.out.println("Tong");
    }
}
