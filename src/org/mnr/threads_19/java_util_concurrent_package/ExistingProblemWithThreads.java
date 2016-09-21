package org.mnr.threads_19.java_util_concurrent_package;

import java.util.Date;

 class demo {

	public static void main(String[] args) {
		/*
		 * ThreadLocal is a class used for maintaining values per thread
		 * ThreadLocal values can be manipulated and changed
		 * 
		 */
		
		ThreadLocal threadLocal	=	new ThreadLocal();
		System.out.println(threadLocal.get());
		threadLocal.set("Naveen");
		System.out.println(threadLocal.get());
		threadLocal.remove();
		System.out.println(threadLocal.get());

	}

}



 

public class ExistingProblemWithThreads {
 
    public static class MyRunnable implements Runnable {
 
        private String threadLocal = new String("");
       
 
        @Override
        public void run() {
           
           threadLocal= new Date().toString();       
           
//           try {
//                        Thread.sleep(4000); 
//                  } catch (InterruptedException e) { e.printStackTrace(); }
         
           System.out.println(Thread.currentThread().getName()+
                               " start time = "+threadLocal);
 
        }
    }
 
 
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
 
        Thread thread1 = new Thread(myRunnable,"Thread-1");
        Thread thread2 = new Thread(myRunnable,"Thread-2");
 
        thread1.start();
        Thread.sleep(1000); //Start thread-2 after 1 second.
        thread2.start();
       
 
    }
 
}
