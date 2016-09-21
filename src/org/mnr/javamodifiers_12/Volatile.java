package org.mnr.javamodifiers_12;

public class Volatile {
	
	
	private static volatile Volatile _instance; //volatile variable public static Singleton getInstance(){ if(_instance == null){ synchronized(Singleton.class){ if(_instance == null) _instance = new Singleton(); } } return _instance;

	

	public static void main(String[] args) {
		/*
		 * It is only applicable for variables
		 * If a value of variable is keep on changed by multiple threads then there may be chance of
		 * data inconsistency. 
		 * So to maintain a seperate copy for each thread
		 * that variable can be declared as volatile..
		 */

	}

	public static Volatile getInstance(){
		
		if(_instance == null)
		{
			synchronized(Volatile.class)
			{
				if(_instance == null)
					_instance = new Volatile();
				} 
			}
		return _instance;
		
		/*
		 * If we do not make the _instance variable volatile than the Thread which is creating instance of Singleton
			is not able to communicate other thread, that instance has been created until it comes out of the Singleton
			block, so if Thread A is creating Singleton instance and just after creation lost the CPU, all other thread
			will not be able to see value of _instance as not null and they will believe its still null
		 */
	}

	
}
