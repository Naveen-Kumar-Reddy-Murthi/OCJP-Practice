package org.mnr.threads_19.java_util_concurrent_package;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Introduction {
	
	public static void main(String...args){
		/*
		 * concurrent package was introducted in java5 to overcome
		 * existing problems with synchronization. 
		 * There are serveral limitations with this
		 * 1. there's no flexibility to try for the lock without waiting
		 * 2. there's no way to specify max waiting for a thread to get lock
		 * 	  sothat thread will wait untill getting the lock 
		 * 3. there's no mechanism to transfer lock from one thread to another
		 * 	  specific thread
		 * 4. there's no mechanism to lisout all waiting threads
		 * 5. synchronized keyword must either be used at method level or inside
		 * 	  method. There's no way to use it across the method
		 * 
		 * All the above limitaitons are fixed in concurrent package
		 * 
		 * Lock interface is having these mechanism. Its impl class is ReentrantLock
		 * Reentrant means acquiring the same lock multiple times
		 */
		
		ReentrantLockEx();
		
		
	}
	
	public static void ReentrantLockEx(){
		ReentrantLock lock= new ReentrantLock();
		lock.lock();
		
		ReentrantLock lock1= new ReentrantLock(true);
		/*
		 * here in the above constructor parameter is fairness policy
		 * if passed true, if follows the fairness scheme i.e., FCFS
		 * if passes false, FCFS won't be followed. It follows random selection
		 * Default parameter is false for ReentrantLock i.e., if no parameter is 
		 * mentioned then fairness considered as false
		 */
		
		System.out.println("Is lock fair:"+lock.isFair());
		System.out.println("Is lock1 fair:"+lock1.isFair());
		
		lock.lock();
		lock.lock();
		System.out.println("Is lock locked:"+lock.isLocked());
		System.out.println("isHeldByCurrentThread:"+lock.isHeldByCurrentThread());
		System.out.println("getQueueLength:"+lock.getQueueLength());
		System.out.println("getHoldCount:"+lock.getHoldCount());
		System.out.println("hasQueuedThreads:"+lock.hasQueuedThreads());
		
		lock.unlock();
		
		System.out.println("Is lock locked:"+lock.isLocked());
		System.out.println("getHoldCount:"+lock.getHoldCount());
		
		lock.unlock();
		
		System.out.println("Is lock fair:"+lock.isFair());
		System.out.println("Is lock locked:"+lock.isLocked());
		
	}

}
