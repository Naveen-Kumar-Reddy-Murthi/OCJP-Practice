package org.mnr.threads_19;

public class DeadLock extends Thread{

	A a	=	new A();
	B b	=	new B();
	
	public void m1(){
		this.start();
	}
	
	public void run(){
		b.d2(a);
	}
	
	public static void main(String[] args) {
		
		DeadLock deadlock	=	new DeadLock();
		deadlock.m1();
		

	}

}

class A {
	public synchronized void d1(B b){
		System.out.println("Thread-A starts execution on d1 method");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("Thread-A trying to call B.last() method");
			b.last();
		}
		
	}
	
	public synchronized void last(){
		System.out.println("Inside A.last() method");
	}
	
}

class B{
	
	public synchronized void d2(A a){
		System.out.println("Thread-B starts execution of B.d2() method");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			System.out.println("Thread-B trying to call A.last() method");
			a.last();
		}
		
	}
	
	
	public synchronized void last(){
		System.out.println("Inside B.last() method");
	}
	
}