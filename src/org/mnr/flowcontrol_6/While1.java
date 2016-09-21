package org.mnr.flowcontrol_6;

public class While1 {

	public static void main(String[] args) {
		
		
		/*
		 * Some curious cases
		 */

//			while(true)
//				System.out.println("hello");
//			System.out.println("hi");//Unreachable code. Because above is infinite loop. Hence this statement is unrachable
//			Compiler is intelligent enough to know that
			
			int a=10,b=20;
			while(a<20)
				System.out.println("hello");
			System.out.println("hit");// Now this is not unreachable because a,b are not constants/final. hence they can be change
									  // hence there's a chance for above sop to get executed.
			
			/*
			 * Every final variable in the code will be replaced with its value after compilation.
			 * If every argument/variable is final, then any expression or statements involving them
			 * will be executed/evaluated at compile time only
			 */
			
				final int x=10;
				final int y=90;
				System.out.println(x);//after compilation this code becomes sop(10)
				System.out.println(y);//after compilation this code becomes sop(90)
	}

}
