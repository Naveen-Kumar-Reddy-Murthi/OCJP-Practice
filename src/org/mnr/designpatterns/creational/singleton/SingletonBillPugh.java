package org.mnr.designpatterns.creational.singleton;

import java.io.Serializable;

public class SingletonBillPugh implements Serializable {
	

	private static final long serialVersionUID = -7604766932017737115L;
	
	private static class SignletonHelper {
		
		
		// This type of singleton works on "Initialization-on-demand holder idiom" principle.
		// It states that The implementation of the idiom relies on the initialization phase of 
		// execution within the Java Virtual Machine (JVM) as specified by the Java Language
		// Specification (JLS). When a class  is loaded by the JVM, the class goes 
		// through initialization. Since the class does not have any static variables to initialize,
		// the initialization completes trivially. The static class definition SignletonHelper within 
		// it is not initialized until the JVM determines that SignletonHelper must be executed.
		// The static class SignletonHelper is only executed when the static method getInstance is invoked 
		// on the class SingletonBillPugh, and the first time this happens the JVM will load and initialize
		// the LazyHolder class. The initialization of the LazyHolder class results in static variable
		// INSTANCE being initialized by executing the (private) constructor for the outer class Something. 
		// class initialization phase is guaranteed by the JLS to be serial, i.e., non-concurrent,
		// no further synchronization is required in the static getInstance method during loading 
		// and initialization. And since the initialization phase writes the static variable INSTANCE
		// in a serial operation, all subsequent concurrent invocations of the getInstance will return
		// the same correctly initialized INSTANCE without incurring any additional synchronization overhead.
		
		
		
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
			
	}
	
	public static SingletonBillPugh getInstance(){
		
		return SignletonHelper.INSTANCE;
	}
	
	protected Object readResolve() {
	    return getInstance();
	}

}
