package org.mnr.threads_19.java_util_concurrent_package;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		
		CustomerThread t1	=	new CustomerThread("Thread-1",11);
		CustomerThread t2	=	new CustomerThread("Thread-2",0);
		CustomerThread t3	=	new CustomerThread("Thread-3",2);
		CustomerThread t4	=	new CustomerThread("Thread-4",0);
		CustomerThread t5	=	new CustomerThread("Thread-5",200);
		CustomerThread t6	=	new CustomerThread("Thread-6",300);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}

class CustomerThread extends Thread{
	static  Integer custId	=	0;
	private int set;
	private static final ThreadLocal<Integer> tl	=	new ThreadLocal<Integer>(){
		protected  Integer initialValue(){
			
			return custId+1;
		}
	};
	 CustomerThread(String name, int set) {
		super(name);
		this.set=set;
	}
	public void run(){
		
		if(set!=0)
			tl.set(tl.get()+set);
		
		System.out.println(Thread.currentThread().getName()+" executing with cust id:"+tl.get());

	}
}

class NonThreadSafeObject{
	private String name;
	public NonThreadSafeObject(String name) {
		this.name=name;
	}
	public String getName(){
		return name;
	}
}