package org.mnr.threads_19.java_util_concurrent_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx2 {

	public static void main(String[] args) {
		
		
		MyThread1 thread1	=	new MyThread1("Thread-1");
		MyThread1 thread2   =   new MyThread1("Thread-2");
		thread1.start();
		thread2.start();

	}

}

class MyThread1 extends Thread{
	static ReentrantLock lock	=	new ReentrantLock(true);
	
	MyThread1(String name){
		super(name);
	}
	
	public void run(){
		if(lock.tryLock()){//this statement returns true if lock is aquired and returns true
			System.out.println(new SimpleDateFormat("hh:mm:ss.SSSS").format(new Date()).toString()+"|"+Thread.currentThread().getName()+" got lock and doing some task");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				lock.unlock();
			}
			
		}
		else{
			System.out.println(new SimpleDateFormat("hh:mm:ss.SSSS").format(new Date()).toString()+"|"+Thread.currentThread().getName()+" didn't get lock and doing alternative operations");
		}
	}
}