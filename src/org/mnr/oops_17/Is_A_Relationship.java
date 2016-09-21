package org.mnr.oops_17;

class Parent{
	
	public int id=10;
	private String name="Naveen Reddy";
	public void parentMethod(){
		System.out.println("parentMethod");
		privateParentMethod();//private method allowed only in it's own class, nowhere else
	}
	
	private void privateParentMethod(){
		System.out.println("privateParentMethod");
	}
}

class Child extends Parent {
	public int id=20;
	private String name1="Naveen Reddy";
	/*
	 * Whatever parent has, if they are also in the child
	 * then they get overridden by child class
	 */
	
	public void childMethod(){
		System.out.println("childMethod");
	}
}

class Child1 extends Child{
	
	public int id=23;
	private String name="Child1";
	
	public void childMethod1(){
		System.out.println("chil1_dMethod");
	}
	
}

public class Is_A_Relationship {

	public static void main(String[] args) {
		
		/*
		 * It is also known as Inheritance
		 * Adv:Code reusability
		 * extend keyword used to implement is-a relationship
		 */
		
		/* Whatever parent has i.e., datamember/methods, all are accessible to child unless they are private */
				Child child	= new Child();
				
				child.childMethod();
				child.parentMethod();
//				child.privateParentMethod();//CE:The method privateParentMethod() from the type Parent is not visible
				System.out.println(child.id);
			 
		/* But child data members/methods aren't available to parent */
			
				Parent parent	=	new Parent();
				parent.parentMethod();
//				parent.childMethod();//CE:The method childMethod() is undefined for the type Parent
				
				
	   /* Parent reference can be used to hold child object
	    * But with that reference we can only call parent specific members/methods */
				
				Parent parent1	= 	new Child();
					parent1.parentMethod();
//					parent1.childMethod();//CE:The method childMethod() is undefined for the type Parent
					
	   /* Child reference can't hold parent object*/
				
//				Child child1	= new Parent();//CE:Type mismatch: cannot convert from Parent to Child
					
		multipleInheritance();
					
	}
	
	public static void multipleInheritance(){
		/*
		 * A class can't extend more than one clas at a time, hence multiple inheritance not supported in java
		 * But multi-level inheritance is supported A extends B, C extends B, then C can have both behaviours of A and B
		 */
					
					Child1 child1	= 	new Child1();
					child1.childMethod();//method of immediate parent class available	
					child1.parentMethod();//method of second level parent method is also avaialable, hence multi-level inheritance is supported
					child1.childMethod1();
		
		/*
		 * If java had supported multiple inheritance, then there might be chance of ambiguity problem 
		 * Suppose A, B are two different class and both have a method m1
		 * Now if C extends A, B and calls m1 method, which method is called by compiler??
		 */
		
	}
	
	public static void cyclicInheritance(){
		/*
		 * Two types of cyclic inheritances
		 * 1. A class extending itself is not allowed
		 * 2. Class A extends Class B and Class B extends Class A
		 * these two are not allowed obviously because of ambiquity problemm
		 * 
		 */
		
		
	}
}


