package org.mnr.innerclasses_26;

public class InterfaceInsideInterface {
	/**
	 * every interface present inside an interface is public and static
	 * whether we declare or not
	 * Hence we can implement the inner interface without implementing 
	 * the outer interface and viceversa
	 */
	
	public static void main(String...args){
		A a	=	new A();
		a.m1();
		B b	=	new B();
		b.m2();
		
		
	}
}

interface Outer{
	public void m1();
	interface Inner{
		public void m2();
	}
}

class A implements Outer{

	@Override
	public void m1() {
		System.out.println("m1 method executed");
	}
}

class B implements Outer.Inner{
	@Override
	public void m2() {
		System.out.println("m2 method executed");
	}
}