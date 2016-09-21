package org.mnr.threads_19.java_util_concurrent_package;

public class InheritableThreadLocalDemo {

	public static void main(String[] args) {
		ParentThread thread	=	new ParentThread();
		thread.start();

	}

}

class ParentThread extends Thread{
	
	public static final InheritableThreadLocal<String> threadLocal 	= new InheritableThreadLocal<String>(){
		
		public String childValue(String parent){
			return "child";
		}
	};	
	
	public void run(){
		threadLocal.set("parent");
		System.out.println("Parent value:"+threadLocal.get());
		ChildThread thread	=	new ChildThread();
		thread.start();
		
	}
}

class ChildThread extends Thread{
	public void run(){
		System.out.println("child value:"+ParentThread.threadLocal.get());
	}
}