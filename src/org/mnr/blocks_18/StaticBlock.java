package org.mnr.blocks_18;

public class StaticBlock {
	static int i=10;
	
	static {
//		System.loadLibrary("");//We can load native libraries using this
		System.out.println("i="+i);
		m1();
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		
		concept();
	}
	
	public static void concept(){
		/*
		 * While executing any java program, jvm first scans all the static members from top to bottom
		 * Then executes their assignment operations and static blocks top to bottom in the specified order
		 * Next main method
		 * static blocks/assignments get executed before main method during classloading itself
		 * this in only till java6, java7 onwards if there is no main method then nothing will be executed
		 * static blocks execution happens only once during class loading
		 */ 
		
		m1();
		System.out.println("main method"); 
	}
	
	public static void m1(){
		System.out.println("m1::"+j);
	}
	
	static{
		System.out.println("second static block");
	}
	static int j=20;
}

class illegalForwardReferenceEx{
	
	static{
//		System.out.println(x);//CE:Cannot reference a field before it is defined
		System.out.println("in static shit block");
	}
	static int x=10;

}
