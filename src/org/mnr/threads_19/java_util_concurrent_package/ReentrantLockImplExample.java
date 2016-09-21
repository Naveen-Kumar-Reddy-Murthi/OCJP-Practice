package org.mnr.threads_19.java_util_concurrent_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockImplExample {

	public static void main(String[] args) {
		
		Display display	=	new Display();
		
		MyThread thread1	=	new MyThread(display, "Naveen");
		MyThread thread2	=	new MyThread(display,"Jon Snow");
		MyThread thread3	=	new MyThread(display,"Dolarus Edd");
		thread1.start();
		thread2.start();
		thread3.start();
		

	}
	
	

}

class Display{
	ReentrantLock lock	=	new ReentrantLock();
	
	public void wish(String name){
		lock.lock();
		System.out.println(new SimpleDateFormat("hh:mm:ss.SSSSSSSS").format(new Date()).toString()+" Good Morning "+name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();
	}
}

class MyThread extends Thread{
	Display display;
	String name;
	MyThread(Display dispaly, String name){
		this.display=dispaly;
		this.name=name;
	}
	
	public void run(){
		display.wish(name);
	}
}