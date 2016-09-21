package org.mnr.threads_19.java_util_concurrent_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx3 {

	public static void main(String[] args) {
		MyThread2 thread1	=	new MyThread2("Thread-1");
		MyThread2 thread2	=	new MyThread2("Thread-2");
		
		thread1.start();
		thread2.start();

	}
	
}

class MyThread2 extends Thread{
	
	static ReentrantLock lock	=	new ReentrantLock();
	public MyThread2(String name) {
		super(name);
	}
	public void run(){
		
		do{
			try {
				if(lock.tryLock(2, TimeUnit.SECONDS)){
					System.out.println(new SimpleDateFormat("hh:mm:ss.SSSS").format(new Date()).toString()+"|"+Thread.currentThread().getName()+" got lock and doing some task");
					Thread.sleep(3000);
					lock.unlock();
					System.out.println(new SimpleDateFormat("hh:mm:ss.SSSS").format(new Date()).toString()+"|"+Thread.currentThread().getName()+"done working and released lock");
					break;
				}
				else{
					System.out.println(new SimpleDateFormat("hh:mm:ss.SSSS").format(new Date()).toString()+"|"+Thread.currentThread().getName()+" couldn't acquire lock");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}while(true);			
	}
}