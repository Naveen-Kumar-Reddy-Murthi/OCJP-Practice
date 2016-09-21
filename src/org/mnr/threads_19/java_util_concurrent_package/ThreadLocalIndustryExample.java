package org.mnr.threads_19.java_util_concurrent_package;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalIndustryExample implements Runnable {
	// threadlocal variable is created
	private static final ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Initializing SimpleDateFormat for - "
					+ Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSSS");
		} 
	};

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalIndustryExample td = new ThreadLocalIndustryExample();
		// Two threads are created
		Thread t1 = new Thread(td, "Thread-1");
		Thread t2 = new Thread(td, "Thread-2");
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}

	@Override
	public  void run() {
		
		System.out.println("Thread run execution started for "
				+ Thread.currentThread().getName());
//		System.out.println("Date formatter pattern is  "
//				+ dateFormat.get().toPattern());
		System.out.println("Formatted date is "
				+ dateFormat.get().format(new Date()));
		
	}
}
