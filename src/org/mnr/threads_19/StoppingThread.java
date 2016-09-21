package org.mnr.threads_19;

public class StoppingThread {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * a thread can be stopped using stop method. But it is decpricated and 
		 * not recommanded to use
		 * 
		 */
		
		MyThread thread	=	new MyThread();
		thread.start();
//		thread.stop();
		
		/*
		 * A thread can be suspended using suspend method of Thread class
		 * Then thread will be immediately entered into suspend state
		 * And it can be resumed using resume method of Thread class
		 * These methods are depricated and not recommanded to use
		 */
		
		thread.suspend();
		thread.sleep(3000);
		thread.resume();
	}

}
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<50;i++)
			System.out.println("MyThread");
	}
}