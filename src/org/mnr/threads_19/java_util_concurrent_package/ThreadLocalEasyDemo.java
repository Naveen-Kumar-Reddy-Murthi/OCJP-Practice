package org.mnr.threads_19.java_util_concurrent_package;

import java.util.Date;

public class ThreadLocalEasyDemo {
	 
    public static class MyRunnable implements Runnable {
 
        private ThreadLocal<String> threadLocal =   new ThreadLocal<String>(){
        	
        	@Override
            protected String initialValue() {
                return (new Date().toString());
          }
        	
        };
       
        @Override
        public void run() {
           
           try {
                        Thread.sleep(1000);
                  } catch (InterruptedException e) { e.printStackTrace();    }
           
         System.out.println(Thread.currentThread().getName()+
               " start time = "+threadLocal.get());
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
