package org.mnr.threads_19;

public class DaemonThreads {

	public static void main(String[] args) {
		
//		conecpt();
		daemonThreadEx();
	}

	public static void conecpt(){
		/*
		 * Main use of daemon thread is to provide support for non-daemon threads
		 * Ex:GarbageCollector, signalDispatcher, AttachListener
		 * If jvm runs out of memory, then GC daemon thread gets called. Meanwhile
		 * main thread continue its execution.
		 * Daemon thread will have low priority but it can be changed as per requirement
		 * We can set thread as Daemon thread before starting it.
		 * But all threads can't be set as daemon threads.
		 * main thread can't be set as daemon as it is started by jvm
		 * Thread class has two methods
		 * 1. setDaemon
		 * 2. isDaemon
		 * If we call isDaemon on our thread after starting it we will get IllegalThreadStateException
		 * 
		 * It's not possible to set main thread as daemon thread. Doing so will result in IllegalThreadStateException
		 * because main thread is already started by jvm
		 */
		
//		Thread.currentThread().setDaemon(true);//Exception in thread "main" java.lang.IllegalThreadStateException
		System.out.println(Thread.currentThread().isDaemon());
		
		/*
		 * By default all threads are non-daemon. Daemon nature is inherited from parent to child. If parent thread
		 * is Daemon then child is also Daemon thread
		 * 
		 * Whenever last non-daemon thread terminates, all daemon threads will be terminated irrespective of their 
		 * state of execution
		 */
		
		
		
	}

	public static void daemonThreadEx(){
		
	
		DaemonThread thread	=	new DaemonThread();
 		thread.setDaemon(true);
//		thread.setPriority(10);
//		System.out.println(thread.isDaemon());
		thread.start();
//		System.out.println(thread.isDaemon());
		System.out.println(thread.isAlive());
	}
}

class DaemonThread extends Thread{
	public void run(){
		
		try{
		while(true){
		System.out.println("Daemon thread is running");
		}
		}
		catch(Exception e){
			System.out.println("Daemon thread is exited");
		}
	}
}
