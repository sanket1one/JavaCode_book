 
class MyThread extends Thread{

	@Override 
	public void run() {
	Thread th = Thread.currentThread(); 
	String name =  th.getName(); 
	try { 
		this.join(); 
	}catch(InterruptedException e) {
		System.out.println(e); 
		}
	for(int i=1; i<= 5;i++) 
	{ 
		System.out.println(i + " "   + name); 
	try { 
		Thread.sleep(250); 
	}catch(InterruptedException e){
		System.out.println(e); 
	}
   
   }
	} 

}
   
   public class ThreadDemo1 {
   
   public static void main(String[] args) throws InterruptedException{ //it is
//   under lang package so while creating object i don't need to import any thing
   MyThread th1 = new MyThread();
   // MyThread th2 = new MyThread(); th1.start();
   th1.join();
   
   // th2.start();
   
   Thread th = Thread.currentThread(); String name = th.getName();
   for(int i =1;
   i<=5; i++) { System.out.println(i + " " + name); 
   try { Thread.sleep(250);
   }catch(InterruptedException e){ System.out.println(e); } } } }
 