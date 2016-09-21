package org.mnr.interfaces_13;

public abstract interface Interface {

		/*
		 * Any service requirement specification is considered as an interface
		 * All the methods in interface are public and abstract by default whether declared or not
		 * An interface is pure abstract i.e., no implementation of methods
		 * 
		 * Every interafce is public and abstract whether we declare it or not
		 * Hence implemented method should be declared as public otherwise we will get CE
		 * 
		 * Only public & abstract are permitted for interface methods and interfaces
		 * No other is allowed
		 * 
		 * If any interface is being implemented by a class, then that class must implement all the
		 * classes of that interface or it should be declared as abstract
		 */


	void m1();
	//{};//CE:Abstract methods do not specify a body
	void m2();
	
}
