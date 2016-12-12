package org.mnr.accessmodifiers_10.test;

import org.mnr.accessmodifiers_10.memberlevelmodifiers.MemberLevelModifiers;

public class TestClass extends MemberLevelModifiers{

	public static void main(String[] args) {
		
		TestClass obj	= 	new TestClass();
		obj.m1();//public method available from child reference
		obj.m3();//protected method only available to child reference from outside package
		obj.m5();//final public method available from child reference
		
		MemberLevelModifiers obj1	= new MemberLevelModifiers();
		obj1.m1();//public method available from parent reference
		obj1.m5();//public final method available from parent reference
//		obj1.m3();//protected method not available using parent object from outside its package
	}

}
