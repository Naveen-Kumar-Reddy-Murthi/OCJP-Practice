package org.mnr.interview.threads;

public class PrintUpToTenUsingTenThreads {

	public static void main(String[] args) throws InterruptedException {
		
		PrintThread p = new PrintThread();
		Thread t1= new Thread(p);
		  t1.start();
		  t1.join();
		  Thread t2= new Thread(p);
		  t2.start();
		  t2.join();
		  Thread t3= new Thread(p);
		  t3.start();
		  t3.join();
		  Thread t4= new Thread(p);
		  t4.start();
		  t4.join();
		  Thread t5= new Thread(p);
		  t5.start();
		  t5.join();
		  Thread t6= new Thread(p);
		  t6.start();
		  t6.join();
		  

	}

}

class PrintThread implements Runnable{
	
	private int i;
	

	@Override
	public void run() {
		System.out.println(i++);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
