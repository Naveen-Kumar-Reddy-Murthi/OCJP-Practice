package org.mnr.innerclasses_26;

public class InnerClassesDemo {
	
	static int i=10;
	private int j;
	
	public int getJ(){
		return this.j;
	}
	public InnerClassesDemo(int j) {
		this.j=j;
	}
	public void m2(){
		System.out.println("This is outer class instance method");
	}
	public static void m3(){
		System.out.println("This is outer class static method");
	}
	
	public static void main(String[] args) {
		/**
		 * Declaring a class inside another class where inner class is required
		 * only for the outer class i.e., there is no chance of inner class
		 * existence without outer class, then we use inner classes
		 * Four types of inner classes
		 * 1. Normal/Regular inner classes
		 * 2. Method local inner classes
		 * 3. Anonymous innser classes
		 * 4. static nested classes
		 */
		
		InnerClassesDemo outer	=	new InnerClassesDemo(13123);
		InnerClassesDemo.Inner inner	=	outer.new Inner();
		inner.m1();
	}
	class Inner{
		
		int j=143;
		/**
		 * This class is a normal/regular inner class
		 * Rules:
		 * 1. It can't have any static members not even main method
		 * 2. We can access this class from outer class as well as 
		 * 	  other than outer class depending on the modifier
		 * 3. This class can be used from outer class, other class
		 * 		and static area of outer class
		 * 4. From this inner class we can access both static and non-static
		 * 	  members of outer class. While doing this, if there are instance/
		 *    static members with same name in both inner and outer classes then
		 *    inner class members only called but not outer class
		 * 5. With in the inner class, this always refers to current inner class
		 * 	  object. If we want to refer current outer class object, we need to
		 * 	  use like OuterClassName.this
		 * 
		 * 6. applicable modifiers for inner classes are
		 * 		public, defautl, final, abstract,private, protected, static
		 */
		
		public void m1(){
			System.out.println("inner class m1 method");
			System.out.println("outer class static i value:"+InnerClassesDemo.i);
			System.out.println("outer class instance j value:"+j);
			m2();//outer class instance m1 method
			m3(); //or
			InnerClassesDemo.m3();
			
			System.out.println("inner class j using this:"+this.j);
			System.out.println("outer class j using outerclass.this:"+InnerClassesDemo.this.j);
		}
//		public static void main(String...args){}//CE:The method main cannot be declared static; static methods can only be declared in a static or top level type
		
//		static int id=123; //CE:The field id cannot be declared static in a non-static inner type, unless initialized with a constant expression
	}
}


