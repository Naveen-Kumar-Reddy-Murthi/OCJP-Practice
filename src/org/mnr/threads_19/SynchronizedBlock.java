package org.mnr.threads_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SynchronizedBlock {

	public static void main(String...args){
		
		concept();
		
	}
	
	public static void concept(){
		/*
		 * Synchronized methods affects the performance very badly
		 * Because whole method is locked. Hundreds of lines of code
		 * If the thread risky code is few lines, it is recommanded to
		 * use synchronized block
		 * Adv is it reduces the thread waiting time
		 * Using synchronized block we can get the lock of current object
		 * particular object or class level lock
		 */
		
		Work work	=	new Work();
		BlockThread t1	=	new BlockThread("t1", work);
		BlockThread t2	=	new BlockThread("t2", work);
		BlockThread t3	=	new BlockThread("t3", work);
		t1.start();
		t2.start();
		t3.start();
		
		/*
		 * First statement which is outside synchronized block in doSomeWork()
		 * is executed by all the threads at the same time. But  code block in 
		 * the synchronized block gets executed one after other
		 */
	}
}

class Work{
	public void doSomeWork(String task){
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date())+"|"+task);
		//above statement can be executed simultaneously by all threads but not below
		try {
//			synchronized(this)//valid. This is current object level lock
			
//			SynchronizedBlock block	=	new SynchronizedBlock();
//			synchronized(block){}//valid. This is object level block
			
			synchronized(Work.class)//valid. This is class level lock
			//Above accepts only object reference or class type
			//any other types are not allowed
			{
			Thread.sleep(200);
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date())+"| inside synchronized block"+"|"+task);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class BlockThread extends Thread{
	
	private Work work;
	private String task;
	
	public BlockThread() {
		// TODO Auto-generated constructor stub
	}
	
	public BlockThread(String task, Work work) {
		
		this.work=work;
		this.task=task;
	}
	
	public void run(){
		System.out.println("start line");
		work.doSomeWork(task);
		System.out.println("end line");
	}
	
}
