package org.mnr.blocks_18;

public class InstanceBlocksInParentChildOrder {

int i=10;
	
	{
		m1();
		System.out.println("parent first instanc block");
	}
	
	public InstanceBlocksInParentChildOrder() {
		System.out.println("parent constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void m1(){
		System.out.println(j);
	}
	{
		System.out.println("parent second instance block");
	}
	int j=20;

}

class Child1 extends InstanceBlocksInParentChildOrder{
	
int c=10;
	
	{
		m1();
		System.out.println("Child first instanc block");
	}
	
	public Child1() {
		System.out.println("Child constructor");
	}
	
	
	public static void main(String[] args) {
		/*
		 * in parent-child hierarchy, jvm will scan all instance assignments and blocks
		 * in both parent and child classes from top to bottom
		 * order:
		 * 1. execution of parent class instance variables and blocks
		 * 2. parent class constructor
		 * 3. child class instance assignments and blocks in their order 
		 * 4. child class constructor
		 * This only executed if child class object is created 
		 * 
		 */
			
			Child1 child	=	new Child1();
			
			System.out.println("child main method");
	}
	
	public void m1(){
		System.out.println(ch);
	}
	{
		System.out.println("parent second instance block");
	}
	int ch=20;
}