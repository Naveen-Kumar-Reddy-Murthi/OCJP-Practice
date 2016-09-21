package org.mnr.accessmodifiers_10;

abstract strictfp class AbstractClass {
	
	
	int value;
	
	/*
	 * Though objects for Abstract classes can't be created
	 * they can have constructors. Just to initialise the 
	 * instance variables sothat they can be useful to its child
	 * classes
	 */
	
	AbstractClass(int value){
		this.value=value;
	}
	
	/*
	 * An abstract class can contain zero or more abstract methods
	 * An abstract class can contain method with it's implementation too
	 * An object can't be created for an abstract class
	 * Hence it needs to inherited by child class inorder to implement it's functionality
	 * Abstract class can be inherited from anywhere or any package
	 * child must implement all the abstract methods in parent
	 * If anyone method is to be unimplemented, that class should be again declared as abstract
	 */
	
	public void show(){
		System.out.println("DefaultClass show method");
	}
	
	/*
	 *  An abstract method is never about implementation. Hene following modifiers are illegal with abstract method
	 *  final, nativ, synchronized, static, private, strictfp
	 */
	
	public abstract void m1();
	public abstract void m2();
	final void method(){
		System.out.println("Final method of an abstract class");
	}
	
	public void m3(){
		System.out.println("public method of abstract class");
	}

}
