package org.mnr.blocks_18;

public class InstanceBlock {
	
	int i=10;
	
	{
		m1();
		System.out.println("first instanc block");
	}
	
	public InstanceBlock() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		
		concept();

	}
	
	public static void concept(){
		
		/*
		 * Instance flow controll is executed everytime an object is created
		 * whenever we are executing a java class first static flow will be executed
		 * In the static flow if any object is getting created, then following sequence will be executed
		 * as part of instance control flow
		 * 1. Identification of instance variable assignments and instance blocks from top to bottom
		 * 2. execution of instance variable assignment and instance blocks
		 * 3. execution of constructor
		 * Instance flow will only be executed when an object of it is being created. otherwise it won't be 
		 * executed
		 */
		
		InstanceBlock block	=	new InstanceBlock();//If this line is commented, then only following is executed
		System.out.println("concept");
		
	}
	
	public void m1(){
		System.out.println(j);
	}
	{
		System.out.println("second instance block");
	}
	int j=20;
}
