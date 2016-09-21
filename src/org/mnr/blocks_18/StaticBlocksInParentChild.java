package org.mnr.blocks_18;

public class StaticBlocksInParentChild {

static int i=10;
	
	static {
		System.out.println("parent i="+i);
		m1();
		System.out.println("parent first static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void m1(){
		System.out.println("parent m1::"+j);
	}
	
	static{
		System.out.println("parent second static block");
	}
	static int j=20;
}

class Child extends StaticBlocksInParentChild{
	
	static int c=10;
	static {
		System.out.println("child c="+c);
		m1();
		System.out.println("child first static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void m1(){
		System.out.println("child m1::"+j);
	}
	
	static{
		System.out.println("child second static block");
	}
	static int ch=20;
	
	
}