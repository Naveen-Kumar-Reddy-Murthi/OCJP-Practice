package org.mnr.threads_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Synchronization {

	public static void main(String[] args) {
		
//		concept();
//		synchronizedDemo();
//		synchronizedCaseStudy1();
		synchronizedCaseStudy2();

	}
	
	public static void concept(){
		/*
		 * synchronization in java can be achieved using synchronized keyword
		 * It is applicable only on methods and blocks
		 * If a method/block is declared synced, only one thread at a time
		 * can execute that block/method
		 * data consistency achived using this but performance will be down
		 * internally synchronization uses locking mechanism
		 * any method/block is synced, then any thread executing that block/method
		 * obtains lock on the whole object and releases when done its task on that block/method
		 * Locking mechanism is handled by jvm. Programmer doesn't need to do anything
		 * 
		 */
	}

	public static void synchronizedDemo(){
		Task task	=	new Task();
		SyncThread thread	=	new SyncThread(task, "Naveen");
		SyncThread thread1	=	new SyncThread(task, "Noone");
		thread.start();
		thread1.start();
		/*
		 * observer carefully, if synchronized is removed from doTask() method of Task class
		 * both threads get executed at exact time.
		 * If not removed, threads will get execute one after anotherb
		 */
	}
	
	public static void synchronizedCaseStudy1(){
		/*
		 * If both threads operating on two different objects then
		 * there's no need for synchronization
		 * Even if there's synchronization there will be no impact on this
		 * Look at the following example
		 */
		
		Task task1	=	new Task();
		Task task2	=	new Task();
		SyncThread thread	=	new SyncThread(task1, "Naveen");
		SyncThread thread1	=	new SyncThread(task2, "Noone");
		thread.start();
		thread1.start();
		/*
		 * In the above case both thread had executed at the same time
		 */
	}

	public static void synchronizedCaseStudy2(){
		/*
		 * Every class in java will have a class level lock
		 * If any thread wants to execute static synchronized method
		 * then that thread aquires level lock.
		 * Once lock is aquired then it can execute any number of static
		 * synchronized methods of that class
		 * While one thread is executing static sync methods, no other threads
		 * are allowed to execute any static synchronized methods of that
		 * class
		 * But other threads are allowed to execute any of following methods
		 * 1. normal static methods
		 * 2. synchronized instance methods
		 * normal instance methods
		 */
		
		Task task	=	new Task();
		
		SyncThread1 thread1	=	new SyncThread1(task, "3");
		SyncThread1 thread2	=	new SyncThread1(task, "2");
		SyncThread1 thread3	=	new SyncThread1(task, "1");
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}


}

class Task{

	public synchronized void doTask(String instruction){
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date())+"|"+instruction);
		try {
			Thread.sleep(200);// This makes jvm that it is still executing the 
			//method and as it is also synchronized jvm will hold other threads
			//to wait until running thread complete its execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static synchronized void staticSynchronizedTask(String instruction){
		System.out.println("staticSynchronizedTask | "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date())+"|"+instruction);
		try {
			Thread.sleep(200);// This makes jvm that it is still executing the 
			//method and as it is also synchronized jvm will hold other threads
			//to wait until running thread complete its execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void normalStaticTask(String instruction){
		System.out.println("normalStaticTask | "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date())+"|"+instruction);
		try {
			Thread.sleep(200);// This makes jvm that it is still executing the 
			//method and as it is also synchronized jvm will hold other threads
			//to wait until running thread complete its execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void instanceSynchronizedTask(String instruction){
		System.out.println("instanceSynchronizedTask | "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date())+"|"+instruction);
		try {
			Thread.sleep(200);// This makes jvm that it is still executing the 
			//method and as it is also synchronized jvm will hold other threads
			//to wait until running thread complete its execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

class SyncThread extends Thread{
	
	private Task task;
	private String instruction;
	
	
	
	public SyncThread(Task task, String instruction) {
		this.task = task;
		this.instruction = instruction;
	}



	public void run(){
		task.doTask(instruction);
	}
	
}

class SyncThread1 extends Thread{
	
	private Task task;
	private String instruction;
	
	
	
	public SyncThread1(Task task, String instruction) {
		this.task = task;
		this.instruction = instruction;
	}



	public void run(){
		if("1".equals(instruction))
		Task.staticSynchronizedTask(instruction);
		else if("2".equals(instruction))
		 Task.normalStaticTask(instruction);
		else if("3".equals(instruction))
		 task.instanceSynchronizedTask(instruction);
		
	}
	
}