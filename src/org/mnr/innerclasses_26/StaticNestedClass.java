package org.mnr.innerclasses_26;

public class StaticNestedClass {

	
	public String outerName="outerClass";
	public static void main(String[] args) {
		/**
		 * A normal inner class with static modifier is called Static nested class
		 * One big difference between normal inner classes and static inner classes is
		 * static inner classes can have static members i.e., static variables and static
		 * methods including main method
		 * 
		 * And static inner class can exist even without the exitence of its outer class
		 * It can also be used outside the outer class without creating outer class
		 * As it is a static member of outer class, it can be accessed directly using class name
		 * 
		 * Except anonymous inner classes all inner classes can have contructors
		 * 
		 * static inner class can only access static members of outer class not instance members
		 * Refer show method of static inner class 
		 */
		
		/**
		 * we can create static inner class objects in two ways
		 * Method1:
		 */
		
		Inner inner	=	new Inner("Naveen");
		inner.main(args);
		
		StaticNestedClass.Inner inner1	=	new StaticNestedClass.Inner("Ravi");
		inner1.show();
		System.out.println(inner1);
		

	}
	
	static class Inner{
	private String name="inner";
	public static String version="1.0";
		Inner(String name){
			this.name=name;
		}
		@Override
		public String toString() {
			
			return "Inner [name=" + name + "]";
		}
		
		public void show(){
//			String s=outerName;//CE:Cannot make a static reference to the non-static field outerName
			System.out.println(this.getClass().getName());
		}
		public static void main(String...args){
			System.out.println("inner class main method");
			Inner inner	=	new Inner("Naveen");
			System.out.println(inner.toString());
		}
		
	}
	

}
