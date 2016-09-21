package org.mnr.threads_19;

public class ImportantThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		
		yield();
//		joinCase1();
//		joinCase2();
//		deadlock1();
//		deadlock2();
//		sleep();
//		interrupt();
//		System.out.println("main method thread statement");//This is executed by main method thread
	}
	
	public static void yield(){
		/*
		 * yield method causes the current thread to pause execution to give 
		 * chance for remaining waiting threads of same priority
		 * If there's no waiting thread or all waiting threads have low 
		 * priority then same thread can continue its execution
		 * If multiple waiting threads are having same priority, then any thread
		 * can execute. This case, behaviour is inconsistent
		 * Yielded thread can execute any time. Totoally depends on thread scheduler
		 * and which in return depends on platform
		 */
		MyThread2 t1	= new MyThread2();
		t1.start();
		for(int i=0;i<10;i++)
			System.out.println("yield method()");
		
	}
	
	public static void joinCase1() throws InterruptedException{
		/*
		 * if one thread has to wait until completion of some other thread then that
		 * one thread should call join method one another thread
		 * 
		 */
		
		MyThread3 t	= new MyThread3();
		t.start();
		t.join();
		
		/*
		 * here main method thread is calling join on another thread i.e., t.join()
		 * So main method will wait until MyThread3 t completes its execution
		 * if t.join() is commented, then boht main method and t will execute simultaneously
		 * else first t thread is executed then main method gets executed
		 */
		
		for(int i=0;i<10;i++)
			System.out.println("main method block");
	}
	
	public static void joinCase2(){
		
		/*
		 * In this case, child thread wil wait unitl main method completes its execution
		 * if we comment mt.join() call in MyThread4 then both child thread and main thread
		 * will execute simultaneously
		 */
		
		MyThread4.mt	=	Thread.currentThread();
		MyThread4	t	=	new MyThread4();
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("main method block");
	} 

	public static void deadlock1() throws InterruptedException{
		/*
		 * here both child thread and main thread will call
		 * join() on each other which will result in deadlock
		 * This method will never execute any thing
		 * It will remain in deadlock forever
		 */
		MyThread4.mt	=	Thread.currentThread();
		MyThread4 t	= new MyThread4();
		t.start();
		t.join();
		
		for(int i=0;i<10;i++)
			System.out.println("main method block");
	}

	public static void deadlock2() throws InterruptedException{
		
		/*
		 * If a thread calls join method on itself then 
		 * that thread will wait forever
		 * It's another case of deadlock 
		 */
		
		System.out.println("deadlock2 start");
		
		Thread.currentThread().join();
		
		System.out.println("deadlock2 end");
		
	}

	public static void sleep() throws InterruptedException{
		/*
		 * If the execution of a thread needs to be paused for a while
		 * then sleep method need to be invoked on that thread
		 */
		
		System.out.println("sleep method start");
		Thread.sleep(2000);
		System.out.println("This whore thread slept for 2000 milli seconds");
		
	}
	
	public static void interrupt() throws InterruptedException{
		
		/*
		 * Only a sleeping or waiting thread can be interrupted
		 * using interrupt method
		 * If interrupt method is executed on non sleeping/waiting
		 * thread, then there won't be any impact on the thread execution
		 * interrupt call will wait until calling thread goes to 
		 * sleeping/waiting mode. Then executes the interrupt method
		 * 
		 */
		System.out.println("start of interrupt method");
		MyThread5	t	=	new MyThread5();
		t.start();
		t.interrupt();
		
		System.out.println("end of interrupt method");
	}
	
}

class MyThread2 extends Thread{
	
	public void run(){
		for(int i=0;i<50;i++)
		{
			System.out.println("MyThread2");
			Thread.yield();//If this is commented then yield method for loop and this for loop execute simultaneously
			//If not, first yield method for loop will be executed then  this block
		}
	}
}

class MyThread3 extends Thread{
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("MyThread2");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class MyThread4 extends Thread{
	static Thread mt;
	public void run(){
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			
		}
	}
}

class MyThread5 extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++)
		{
			System.out.println("I'm a sleeping thread");
			try {
				System.out.println("before sleep i="+i);
				Thread.sleep(200);
				System.out.println("after sleep i="+i);
			} catch (InterruptedException e) {
				System.out.println("catch block i="+i);
				System.out.println("Some whore thread woke me up. I'm back to work again!");
//				e.printStackTrace();
			}
		}
	}
}
