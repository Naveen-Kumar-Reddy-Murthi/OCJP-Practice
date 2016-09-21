package org.mnr.accessmodifiers_10.memberlevelmodifiers;

public class TestClass extends MemberLevelModifiers {

	public static void main(String[] args) {
		
		TestClass obj	= 	new TestClass();
		obj.m1();//public method available from child reference
		obj.m3();//protected method  available to child reference  with in the package
		obj.m5();//final public method available from child reference
		obj.m4();//default method available to child reference with in the package
		
		MemberLevelModifiers obj1	= new MemberLevelModifiers();
		obj1.m1();//public method available from parent reference
		obj1.m5();//public final method available from parent reference
		obj1.m3();//protected method  available to parent reference  with in the package
		obj1.m4();//default method available to child reference with in the package

	}

}
