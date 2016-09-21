package org.mnr.innerclasses_26;

public class OtherClass {

	public static void main(String[] args) {
			
		RegularInnerClass outer	=	new RegularInnerClass();
		RegularInnerClass.Inner inner	=	outer.new Inner(100);
		inner.m1();
		inner.m2();
		inner.showValue();

	}

}
