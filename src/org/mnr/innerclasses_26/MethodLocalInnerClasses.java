package org.mnr.innerclasses_26;

public class MethodLocalInnerClasses {
	
	int i=10;
	static String name="naveen";

	public static void main(String[] args) {
		
		/**
		 * A class inside a method is called MethodLocalInner classes
		 * purpose is for defining method specific classes
		 * best suited for 
		 * these classes can only be accessed using the method in which
		 * they are defined. 
		 * Outside the method, these are not accessible
		 */
		new MethodLocalInnerClasses().m1();
	}
	
	public void m2(){
		System.out.println("test m2 method| name:"+name);
	}
	
	public void m1(){
		
		int value=10;
		final String m1="Valar Morghilis";
		/**
		 * Rules
		 * 1. If method local class is defined inside instance method
		 *    then it can access both static and non-static members
		 *    of outer class
		 * 2. But if it is defined inside a static method, then it
		 * 	  can only access static members of that outer class
		 * 3. From inside method local class, we can't access local
		 * 	  variables of method i.e., refer value variable in 
		 *    this method
		 * 4. Method local classes can't have neither static variables
		 * 	  nor static methods
		 * 5. No modifiers are allowed for method local inner classes
		 * 	  except abstract, final and strictfp
		 */
		
		 class Inner {
			 public Inner(){
				 
			 }
//			 static int i=0;//CE:The field i cannot be declared static in a non-static inner type, unless initialized with a constant expression
			static final int j=10;//allowed as this is a constant
			 public void sum(int x, int y){
				System.out.println("static member of outer class name:"+name);
				System.out.println("non-static member of outer class name:"+i);
//				System.out.println("method local variable value:"+value);//CECannot refer to the non-final local variable value defined in an enclosing scope
				System.out.println("method local final variable m1:"+m1);
				System.out.println( "Sum is :"+(x+y));
			}
		}
		 
		 class Inner1 extends Inner{ }//allowed
		
		Inner inner	=	new Inner();
		inner.sum(10, 20);
		
	}
	
	public static void m3(){
		class Inner {
//			static int val=190;//static members not allowed inside method local classes
			public void sum(int x, int y){
				System.out.println("static member of outer class name:"+name);
//				System.out.println("non-static member of outer class name:"+i);//CE:Cannot make a static reference to the non-static field i
				System.out.println( "Sum is :"+(x+y));
			}
		}
		
	}

}
