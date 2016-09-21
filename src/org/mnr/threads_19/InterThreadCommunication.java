package org.mnr.threads_19;

public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Inter thread communication is possible through wait, notify/notifyAll methods
		 * these three methods are part of object class not thread class
		 * To call these methods on any object, thread should be the owner of that object
		 * These methods can only be called from synchronized block otherwise IllegalStateMoniterException
		 * 
		 */
		ThreadB b	=	new ThreadB();
		b.start();
		synchronized(b){
			System.out.println("Parent thread calling wait method on child thread");
			b.wait();
			System.out.println("Main thread got notified");
			System.out.println(b.total);
		}
		
	}

}

class ThreadB extends Thread{
	int total=0;
	public void run(){
		synchronized(this){
			System.out.println("Child thread starts calculation");
			for(int i=0;i<=100;i++){
				total=total+i;
			}
			System.out.println("Child thread notifying waiting thread");
			this.notify();
		}
	}
}

