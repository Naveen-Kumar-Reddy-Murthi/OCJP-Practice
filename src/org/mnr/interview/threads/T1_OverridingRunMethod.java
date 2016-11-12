package org.mnr.interview.threads;

public class T1_OverridingRunMethod {
	
	public static void main(String...args){
		
		Thread1 t1 = new Thread1("Thread-1");
		Thread1 t2 = new Thread1("Thread-2");
		t1.start();
		t2.start();
		
	}

}

class Thread1 extends Thread{
	
	private String name;
	
	Thread1(String name){
		
		this.name=name;
	}
	
	@Override
	public synchronized void start() {
		System.out.println(this.name+ " Thread Started");
		super.start();
		/**
		 * If we are to override start method, we must call super.start() post our logic
		 * Otherwise thread behaviour will not be achieved.
		 */
		
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println(this.name+"|"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
