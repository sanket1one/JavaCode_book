//
//
/* implements runnable s interface*/
class MyThread implements Runnable{
	  MyThread(){ 
		  new Thread(this).start(); }
	 
	public void run() {
		for(int i = 1; i<10;i++) {
			System.out.print(i + " ");
		}
	} }

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyThread th = new MyThread();
	}

}
