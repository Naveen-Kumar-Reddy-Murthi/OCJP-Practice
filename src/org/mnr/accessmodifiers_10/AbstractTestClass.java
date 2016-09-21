package org.mnr.accessmodifiers_10;

 public  class AbstractTestClass extends AbstractClass{

	AbstractTestClass(int value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
//		AbstractClass abstractClass	=	new AbstractClass();//CE:Cannot instantiate the type AbstractClass
		
		AbstractClass cl	= 	new AbstractTestClass(10);
		cl.m1();
		cl.m2();
		cl.method();
		cl.m3();

	}

	@Override
	public void m1() {
		System.out.println("Child m1");
		
	}

	@Override
	public void m2() {
		System.out.println("Child m2");
		
	}
	
//	@Override
//	public void method(){}//CE:Cannot override the final method from AbstractClass

}
