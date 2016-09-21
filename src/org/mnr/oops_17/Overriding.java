package org.mnr.oops_17;

import java.io.IOException;



public class Overriding {

	public static void main(String[] args) throws IOException {
		/*
		 * By default, whatever parent has, child will get it except private members/methods
		 * Child class can override non-private members/methods as per requirment
		 * This called overriding in java
		 * The method of parent class which is being changed in child class is called Overridden method
		 * The new method in child class is called overriding method
		 */
		 
//		concept();
//		coVarientReturnType();
//		privateMethodAccess();
//		finalMethodAccess();
//		abstractMethodAccess();
//		overridingScopeOfModifiers();
//		exceptionHierarchyInOverriding();
//		OverridingWRTStaticMethods();
//		methodHiding();
//		varArgOverriding();
		dataMembersOverriding();
	}
	
	public static void concept(){
		
		Parent_1 parent1	=	new Parent_1();
		
		parent1.parentMethod();
//		parent.parentMethod1();//CE:The method parentMethod1() from the type Parent is not visible
		
		
		Child_1 child1		=  new Child_1();
		
		child1.childMethod();
		child1.parentMethod();
		
		Parent_1 parent2	= new Child_1();
		
		parent2.parentMethod();//this calls parentMethod which is overridden child class
		parent2.m1();
		
		/*
		 * In the above statement method resolution took place at runtime by jvm,
		 * hence it is called runtime/dynamic polymorphism or late binding
		 */	
	}

	public static void coVarientReturnType(){
		
		
		Parent_1 parent	= new Child_1();
		parent.m1();
		/*
		 * This method has a co-varient return type
		 * return type of this method is child class of return type of parent method 
		 * This is called covarient return type
		 * introduced in java4
		 */
		Parent_1 parent1	= 	new Parent_1();
		parent1.m1();
		
		Child_1	child1		=	new Child_1();
		child1.m1();
	}

	public static void privateMethodAccess(){
		/*
		 * parent class's private methods won't be available to child
		 * However child class can have exact same private method
		 * then again its not overriding. It's all new method of child class
		 * Look at parentMethod1 in both parent and child clases
		 */
		
			Parent_1 parent	=	new Parent_1();
//				parent.parentMethod1();//CE:The method parentMethod1() from the type Parent_1 is not visible
				/*
				 * private methods are accessible only from their own class
				 */
	}

	public static void finalMethodAccess(){
		/*
		 * parent class final methods can't be overridden in child class
		 * refer m2 method in child and parent class
		 */
	}
	
	public static void abstractMethodAccess(){
		
		/*
		 * Parent class abstract methods must be implemented in child class
		 * otherwise that child class must be declared as abstract
		 * A non-abstract method of parent can be declared as abstract in child
		 * Use: to restrict the access of specific method to next child class in the hierarchy
		 */
		
//		Parent_2 parent	= new Parent_2();//CE:Cannot instantiate the type Parent_2 since it is an abstract class
		
		Child_2 child	= 	new Child_2();
		child.m1();
		child.m2();
		
		Parent_2 parent1	=	new Child_2();
//		parent1.m1();
		parent1.m2();
		
		/*
		 * Following modifiers don't keep any restrictions while overriding parent methods
		 * synchronized, native, strictfp
		 */
	}
	
	public static void overridingScopeOfModifiers(){
		
		/*
		 * while overriding the parent methods, we are not allowed to reduce the scope of modifiers
		 * But we can increase the scope of modifiers
		 * Order:
		 * 
		 * private	<  default	 <	protected  <  public
		 * 
		 * Refer m5 from  org.mnr.oops_17.Parent_2 and  org.mnr.oops_17.Child_2
		 * 
		 */
	}
	
	public static void exceptionHierarchyInOverriding() throws IOException{
		/*
		 * Just like access modifiers, overriding method should only same
		 * exception class as parent or its parent class
		 * Or need not to throw any exception. But caller of that method must hanle that exception otherwise CE
		 * Otherway around is not allowed. Doing so will result in CE
		 * This rule is only for CheckedExceptions but not for unchecked Exceptions
		 * Refer m6 from  org.mnr.oops_17.Parent_2 and  org.mnr.oops_17.Child_2
		 * 
		 */
		
		Parent_2 parent	= new Child_2();
		parent.m6();

		
		Child_2	child1		=	new Child_2();
		child1.m6();
	}
	
	public static void OverridingWRTStaticMethods(){
		/*
		 * static method can't be overridden as non static
		 * Ex: static org.mnr.oops_17.Parent_2.m7() and   org.mnr.oops_17.Child_2.m7()
		 * similarly non static method can't be overridden as static
		 * Ex: void org.mnr.oops_17.Parent_2.m8() and static void org.mnr.oops_17.Child_2.m8()
		 * If both methods in child and parent are static, then we won't get any CE
		 */
		

		Child_2 child	= 	new Child_2();
		child.m7();
		Child_2.m7();
		
		Parent_2 parent1	=	new Child_2();
		parent1.m7();
		Parent_2.m7();
	}
	
	public static void methodHiding(){
		/*
		 * if both parent and child methods are having same method with static modifier
		 * then it's called method hiding
		 * It's not overriding
		 * It method resolution is taken care by compiler
		 * It is called as compile/static time polymorphism or early binding
		 */
		
		Child_2 child	= 	new Child_2();
		child.m9();
		Child_2.m9();
		
		Parent_2 parent1	=	new Child_2();
		parent1.m9();
		Parent_2.m9();
	}

	public static void varArgOverriding(){
		/*
		 * Parent_2 is abstract method
		 * var-arg parameterized method can be passed no parameter at all. It is legal. refer line no. 196 and 202
		 * If overriding and overridden methods are not same type var-arg params, then it's not overriding its overloading
		 * var-arg parameterized method will have the least priority
		 * If no other method is present then only it is called
		 */
		
		Child_2 child	= 	new Child_2();
		child.varargMethod();//this and below both are valid and both calls var-arg parameterized methods
		child.varargMethod("","");
		child.varargMethod("");
		
		
		Parent_2 parent1	=	new Child_2();
		parent1.varargMethod();//this and below both are valid and both calls var-arg parameterized methods
		parent1.varargMethod("","");
		parent1.varargMethod("");
		
	}

	public static void dataMembersOverriding(){
		/*
		 * datamembers can't be overridden in java
		 * refer value variable in both Parent_2 and Child_2 classes
		 * data members are resolved by compiler based on reference type
		 * No matter what modifier(static etc) data members have, this behaviour doesn't affect it. 
		 */
		
		Child_2 child	= 	new Child_2();
		System.out.println(child.value);
		
		Parent_2 parent1	=	new Child_2();
		System.out.println(parent1.value);
		
		Parent_2 parent2	=	new Parent_2();
		System.out.println(parent2.value);
	}
}

	

class Parent_1{
	
	public void parentMethod(){
		System.out.println("parentMethod");
	}
	private void parentMethod1(){
		System.out.println("private parentMethod");
	}
	
	public Object m1(){
		System.out.println("Parent Object return type method");
		return new Object();
	}

	public final void m2(){
		
		System.out.println("parent final method");
	}
}

class Child_1 extends Parent_1{
	
	@Override/*while overriding method signature must be match with tha of parent class method*/
	public void parentMethod() {
		System.out.println("overridden parentMethod");
	}
	
	public void childMethod(){
		System.out.println("childMethod");
	}
	
	public String m1(){
		/*
		 * This method has a co-varient return type
		 * return type of this method is child class of return type of parent method 
		 * other way around is not allowed
		 * This is called covarient return type
		 * introduced in java4
		 */
		System.out.println("method with co-varient return type");
		System.out.println("Child overriden String return type method");
		return null;
	}
	
	private void parentMethod1(){
		System.out.println("childPrivateMethod");
	}
	
//	public final void m2(){//CE:Cannot override the final method from Parent_1
//		System.out.println("parent final method");
//	}
}
