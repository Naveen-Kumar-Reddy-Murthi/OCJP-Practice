package org.mnr.threads_19.java_util_concurrent_package;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * If we want the thread to return something after executing its job, we
		 * can use Callable interface to pass to a Thread object
		 */
		PrintJob1[] jobs = { new PrintJob1("Job-1"), new PrintJob1("Job-2"),
				new PrintJob1("Job-3"), new PrintJob1("Job-4"),
				new PrintJob1("Job-5"), new PrintJob1("Job-6"),
				new PrintJob1("Job-7"), new PrintJob1("Job-8") };

		ExecutorService service = Executors.newFixedThreadPool(5);

		for (PrintJob1 job : jobs){
			Future<Object> f=service.submit(job);
//			System.out.println(f.get()+"is done.");//this almost restricts multi threading functionality
			//due to retrieving response
		}
			service.shutdown();

	}

}

class PrintJob1 implements Callable {// If Runnable interface is used, thread
										// won't return anything
// if we want thread to return something then we can use Callable interface
// whose only call method returns an object.
	private String name;

	public PrintJob1(String name) {
		this.name = name;
	}

	public Object call() {

		System.out.println(new SimpleDateFormat("hh:mm:ss.SS").format(
				new Date()).toString()
				+ "| "
				+ name
				+ " started by "
				+ Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("hh:mm:ss.SS").format(
				new Date()).toString()
				+ "| "
				+ name
				+ " compltd by "
				+ Thread.currentThread().getName());
		return name;
	}
}
