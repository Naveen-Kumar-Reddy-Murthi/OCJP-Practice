package org.mnr.interview.threads;

public class WaitNofifyDemo {

	public static void main(String[] args) {
		MyRunnable run	=	new MyRunnable();
		Thread t1 = new Thread(run);
		t1.start();
		synchronized (run) {
			System.out.println("waiting");
			try {
				run.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My waiting is over");
			System.out.println("exiting...");
		}

	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I'm done. Nofifying");
			this.notify();
			System.out.println("after notify");
		}
		
	}
	
	
}
