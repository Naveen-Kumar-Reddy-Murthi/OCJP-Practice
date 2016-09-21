package org.mnr.blocks_18;
/*
 * These ways only work untill java6,
 *  From java7 onwards, jvm will throw RE without executing static blocks/assignments
 */

public class ExecutingStatementsWOMainMethod {
	
	static int val=m1();
	
	public static int m1(){
		
		System.out.println("test print");
		System.exit(0);
		return 1;
	}

}

class ExecutingStatementsWOMainMethod_1{
	static  ExecutingStatementsWOMainMethod_1 obj	= new  ExecutingStatementsWOMainMethod_1();
	//instance block
	{
		System.out.println("test print1");
		System.exit(0);
	}
}

class ExecutingStatementsWOMainMethod_2{
	
	ExecutingStatementsWOMainMethod_2 test	=	new ExecutingStatementsWOMainMethod_2();
	ExecutingStatementsWOMainMethod_2(){
		System.out.println("test print2");
		System.exit(0);
	}
}
