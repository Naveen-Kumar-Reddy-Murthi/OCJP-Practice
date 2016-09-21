package org.mnr.accessmodifiers_10.test;

import org.mnr.accessmodifiers_10.PublicClass;

//import org.mnr.accessmodifiers10.DefaultClass;//CE:The type org.mnr.accessmodifiers10.DefaultClass is not visible

public class OutsidePacakgeTest {

	public static void main(String[] args) {
		/*
		 * as this is being accessed outside it's package, then it is not allowed
		 */
		
//		DefaultClass defaultClass	= new DefaultClass();//CE:DefaultClass cannot be resolved to a type
//		defaultClass.show();
		
		/*
		 * As PublicClass is public, it can be accessed from anywhere
		 */
		
		PublicClass publicClass	=	new PublicClass();
		publicClass.show();
		System.out.println(publicClass.val);

	}

}
