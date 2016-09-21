package org.mnr.oops_17;

public class Coupling {

	public static void main(String[] args) {
		/*
		 * The degree of dependency between objects is called coupling
		 * If dependency is more it is tigtly coupled else loosely coupled
		 */
			A a	=	new A();
			System.out.println(a.i);
			/*
			 * Above class is tightly coupled with other classes
			 * Disadvantages: any modify in those classes will affect the others
			 * reusability is being restricted
			 * maintainability is difficult
			 */
	}

}

class A{
	static int i=B.j;
	public A(){
		System.out.println("An instance of A initialized");
	}
}
class B{
 static	int j=C.k;
 public B(){
		System.out.println("An instance of B initialized");
	}
}
class C{
	static int k=D.m1();
	public C(){
		System.out.println("An instance of C initialized");
	}
	
}
class D{
	
	public D(){
		System.out.println("An instance of D initialized");
	}
	public static int m1(){
		return 2;
	}
}
