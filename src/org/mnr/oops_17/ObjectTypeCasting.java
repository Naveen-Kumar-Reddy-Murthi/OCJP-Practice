package org.mnr.oops_17;

import java.util.ArrayList;
import java.util.List;

public class ObjectTypeCasting {

	public static void main(String[] args) {
		
//		useParentRefToHoldChildObject();
//		useInterfaceRefToHoldImplementedClassObject();
//		objectCastingRules();
		someExamples();
	}
	
	public static void useParentRefToHoldChildObject(){
		/*
		 * Parent reference can be used to hold child object
		 */
		
		Object string	=	new String("Naveen");
		System.out.println(string);
	}
	
	public static void useInterfaceRefToHoldImplementedClassObject(){
		/*
		 * An interface reference can be used to hold any it's implementation
		 * class object
		 */
		
		Runnable thread	= 	new Thread();
	}

	public static void objectCastingRules(){
		/*
		 * 		A		b				=		(c)		 d;
		 *	  (C/I)   (Ref var name)		   (C/I)	(Ref var name)
		 *
		 *	Rule 1: c and d must have some relation. Either child to parent or parent to child or same type
		 *			otherwise compile time error
		 *			This rule is compile time check
		 *	Ex1:
		 */
				Object 		   obj		=	new String("Naveen");
//				StringBuffer   buffer	=	(StringBuffer)obj;//here RE:java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.StringBuffer
//				System.out.println(buffer);
				
		/*
		 * Ex2:
		 */
				String string	=	new String("Naveen"); 
//				StringBuffer sb	=	(StringBuffer)string;//CE:Cannot cast from String to StringBuffer
				
		/*
		 *  Rule 2: c must be either same/derived type of A/implementated class of A otherwise CE
		 *  		This is also compile time check
		 */
				Object 		   obj1	=(List<String>)	new ArrayList<String>();
				System.out.print("is obj1 instance of Object class:");
				System.out.print(obj1 instanceof Object);
				System.out.println();
				System.out.print("is obj1 instance of ArrayList class:");
				System.out.print(obj1 instanceof ArrayList);
				System.out.println();
				System.out.println(obj1.toString());
				
		/*
		 * 	Rule3: Runtime object of 'd' must be either same or derived type of 'C' otherwise RE:ClassCastException
		 * Ex3: Refer to EX1. When run RE is thrown by jvm
		 * Ex4: Valid way of casting
		 */
				
				Object obj2	=	new String("Naveen");
				Object obj3	=	(String)obj2;
				System.out.print("is obj3 instance of String class:");
				System.out.print(obj3 instanceof java.lang.String);
				System.out.println();
				System.out.println(obj3);
				System.out.print("is obj3 instance of String class:");
				
				
					
	}

	public static void someExamples(){
		
		C1 c	= new C1();
		B1 b	= new C1();
		A1 a	= new C1();
		System.out.println(b instanceof B1);
		System.out.println(b instanceof C1);
		
		System.out.println(a instanceof B1);
		System.out.println(a instanceof C1);
		System.out.println(a instanceof A1);
		
		/*
		 * In follwing ex, three cases runtime object is C1, hence overriding C1.m1() is called everytime
		 * 
		 */
		
			c.m1();
			((B1)c).m1();
			((A1)((B1)c)).m1();
		
		
		
		/*
		 * In follwing ex, m2 is static method, so method resolution is based on reference type at compile time
		 */
		
		c.m2();
		((B1)c).m2();
		((A1)((B1)c)).m2();
		
		/*
		 * In follwing ex,instance variables are resolved based on reference type
		 */
		
		System.out.println(c.x);
		System.out.println(((B1)c).x);
		System.out.println(((A1)((B1)c)).x);
	}
}

class A1{	
	int x=7;
	void m1(){
		System.out.println("A1.M1");
	}
	static void m2(){
		System.out.println("A1.M2");
	}
}
class B1 extends A1{
	int x=8;
	@Override
	void m1(){
		System.out.println("B1.M1");
	}
	static void m2(){
		System.out.println("B1.M2");
	}
}
class C1 extends B1{
	int x=9;
	@Override
	void m1(){
		System.out.println("C1.M1");
	}
	static void m2(){
		System.out.println("C1.M2");
	}
}