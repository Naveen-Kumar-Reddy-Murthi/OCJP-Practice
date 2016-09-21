package org.mnr.threads_19.java_util_concurrent_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {

	public static void main(String[] args) {
		
		/*
		 * here PrintJob is a Runnable object. But it's run method won't return anything
		 * when run by any thread.
		 * 
		 */
		PrintJob[]	jobs	=	{new PrintJob("Job-1"),
								 new PrintJob("Job-2"),
								 new PrintJob("Job-3"),
								 new PrintJob("Job-4"),
								 new PrintJob("Job-5"),
								 new PrintJob("Job-6"),
								 new PrintJob("Job-7"),
								 new PrintJob("Job-8")};
		
		ExecutorService	service	=	Executors.newFixedThreadPool(3);
		
			for(PrintJob job: jobs)
				service.submit(job);
			service.shutdown();

	}

}

class PrintJob implements Runnable{//If Runnable interface is used, thread won't return anything 
	//if we want thread to return something then we can use Callable interface whose only call method returns an object.
	private String name;
	public PrintJob(String name) {
		this.name=name;
	}
	
	public void run(){
		
		System.out.println(new SimpleDateFormat("hh:mm:ss.SS").format(new Date()).toString()+"| "+name+" started by "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("hh:mm:ss.SS").format(new Date()).toString()+"| "+name+" compltd by "+Thread.currentThread().getName());
	}
}