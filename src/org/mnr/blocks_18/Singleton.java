package org.mnr.blocks_18;

public class Singleton {

	public static void main(String[] args) {
		/*
		 * If one object is same for all components, then we need only one instance of that object
		 * In this scenario, we create singleton classes
		 * Ex: Runtime, BusinessDelegate, ServiceLocator
		 * No matter how many times objects are acquired, they all point to single object
		 */

		userDefinedSingleton();
	}
	
	 public static void userDefinedSingleton(){
		 /*
		  * Rules for singleton classes
		  * 1. private constructor
		  * 2. private static instance variable
		  * 3. public factory method
		  * Though user-defined singlton class need not to be final, it can't be inherited by any class
		  * due to private constructor. Hence it is impossible to have a child class
		  */
		 
		 UserDefinedSingleton instance	= UserDefinedSingleton.getInstance();
		 instance.doTask();
	 }
}

class UserDefinedSingleton{
	
	private static UserDefinedSingleton instance = new UserDefinedSingleton();
	
	private UserDefinedSingleton(){
		//restricts object instantiation
	}
	
	public static UserDefinedSingleton getInstance(){
		
		return instance;
	}
	
	public synchronized void doTask(){//since this method is same for all, it is recommanded to keep it as synchronized to avoid data inconsistency
		System.out.println("Task completed");
	}
}


class UserDefinedSingleton1{
	
	private static UserDefinedSingleton1 instance = null;
	
	private UserDefinedSingleton1(){
		//restricts object instantiation
	}
	
	public static UserDefinedSingleton1 getInstance(){
		
		if(instance==null)
			instance = new UserDefinedSingleton1();
		
		return instance;
	}
	
	public synchronized void doTask(){//since this method is same for all, it is recommanded to keep it as synchronized to avoid data inconsistency
		System.out.println("Task1 completed");
	}
}

//class Child4 extends UserDefinedSingleton1{}//CE:Implicit super constructor UserDefinedSingleton1() is not visible for default constructor. Must define an explicit constructor