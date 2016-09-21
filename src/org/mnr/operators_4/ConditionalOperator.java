package org.mnr.operators_4;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
		 * only possible ternary operator
		 */
			
			int x = (10>20)?10:20;
			System.out.println(x);
			
		/*
		 * We can nest ternary operator
		 */
			
			int y	=	(10>20)?((5>7?5:7)):((12>11?6:11));
			System.out.println(y);
	}

}
