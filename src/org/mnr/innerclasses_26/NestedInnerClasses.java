package org.mnr.innerclasses_26;

public class NestedInnerClasses {

	public static void main(String[] args) {
		NestedInnerClasses outer	=	new NestedInnerClasses();
		NestedInnerClasses.A inner1	=	outer.new A();
		A.B	inner2		=	inner1.new B();
		A.B.C inner3	=	inner2.new C();
		inner3.m1();

	}
	
	class A{
		class B{
			class C{
				public void m1(){
					System.out.println("Inner most class C's m1 method");
				}
			}
		}
	}

}
