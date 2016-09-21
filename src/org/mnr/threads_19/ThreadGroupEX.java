package org.mnr.threads_19;

public class ThreadGroupEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		concept();
//		theThreadGroupClassExample();
//		addThreadsToThredGroup();
		showSystemActiveThreads();
	}

	public static void concept(){
		/*
		 * Grouping threads based on functionality
		 * A thread group contains group of threads
		 * A thread group can also contain sub thread group
		 * main thread belongs to main thread group
		 * every thread group in java either directly or indirectly 
		 * belongs to System group
		 * System group contains serveral system level threads
		 * ex: Finalizer, ReferenceHandler, SignalDispatcher and AttachListner
		 */
		
		System.out.println("current ThreadGroup Name:"+Thread.currentThread().getThreadGroup().getName());
		System.out.println("current ThreadGroup's parent thread group name:"+Thread.currentThread().getThreadGroup().getParent().getName());
	}
	
	public static void theThreadGroupClassExample(){
		ThreadGroup group1	=	new ThreadGroup("Group-1");
		/*
		 * Above creates a thread group with name Group-1 which is child of main and sub child of System
		 */
		
		System.out.println("group1's parent group name"+group1.getParent().getName());
		
		ThreadGroup group2	=	new ThreadGroup(group1,"Group-2");
		/*
		 * here group2's parent group is group1
		 */
		
		System.out.println("group2's parent group name"+group2.getParent().getName());
		
		/*
		 * Following are some useful methods of ThreadGroup class
		 */
		
		group1.setMaxPriority(6);//Default thread group priority is 10
		System.out.println("group1's max priority"+group1.getMaxPriority());;
		System.out.println("group1's group name"+group1.getName());
		/*
		 * following method lists the detais of thread group to console
		 * name,priority and its subgroups are listed
		 */
		group1.list();
		System.out.println("group1's active thread count"+group1.activeCount());
		System.out.println("group1's active ThreadGroup count"+group1.activeGroupCount());
		
		ThreadGroup threadGroups	[]	=	new ThreadGroup[1];
		group2.enumerate(threadGroups);
		
		for(ThreadGroup tGroup: threadGroups)
			System.out.println(tGroup.getName());
	}
	
	public static void addThreadsToThredGroup(){
		
		ThreadGroup group	=	new ThreadGroup("Group-1");
		
		RunnableThread rThread1	=	new RunnableThread();
		RunnableThread rThread2	=	new RunnableThread();
		RunnableThread rThread3	=	new RunnableThread();
		
		Thread t1	=	new Thread(group,rThread1,"Thread-1");
		Thread t2	=	new Thread(group,rThread2,"Thread-2");
		group.setMaxPriority(4);
		Thread t3	=	new Thread(group,rThread3,"Thread-3");
//		group.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
//		group.interrupt();//interrupts all the threads present in this group
		System.out.println("t1 prioriy:"+t1.getPriority());
		System.out.println("t2 prioriy:"+t2.getPriority());
		System.out.println("t3 prioriy:"+t3.getPriority());
		
		System.out.println("group's parent group details:"+group.getParent());
		System.out.println("group's current active thread count:"+group.activeCount());
		System.out.println("group's max priority:"+group.getMaxPriority());
		
		Thread [] threads=	new Thread[3];
		group.enumerate(threads,true);//this method copies all its threads and sub group's threads into specified array
		for(Thread t: threads)
			System.out.println(t.getName());
		
		group.destroy();//destroys this thread group and its child thread group
	}
	
	public static void showSystemActiveThreads(){
		ThreadGroup system	=	Thread.currentThread().getThreadGroup().getParent();
		Thread[] threads= new Thread[system.activeCount()];
		system.enumerate(threads);
		for(Thread t:threads)
			System.out.println(t.getName()+"----"+t.isDaemon());
	}
}

class RunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" running");
		try {
			Thread.sleep(10000);
			System.out.println(Thread.currentThread().getName()+" just woke up");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(Thread.currentThread().getName()+" got interrupted by some whore");
		}
		
	}
	
}
