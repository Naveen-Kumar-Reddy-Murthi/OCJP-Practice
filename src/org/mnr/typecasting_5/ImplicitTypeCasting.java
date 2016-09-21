package org.mnr.typecasting_5;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		/*
		 * Type casting performed by jvm is know as Implicit typecasting 
		 * It's when we are assiging smaller datatype value to bigger datatype
		 * It's also called widening/upcasting
		 * No data is lost while doing this
		 */
		
		/*
		 * 	Following is the upcasting precedence
		 * 
		 * 		byte	-->short -|
		 * 						   -->	int	-->long	-->float  -->double
		 * 				  char	 -|
		 */
		
			int val	=	'a';//here we are assigning a char to int, jvm will automatically cast char to int
			System.out.println(val);// here jvm assigns ASCII value of  'a' to val variable
			
			double val1	=	10;
			System.out.println(val1);//jvm casts 10 to its float equivalent 10.0
			
			byte b	=	20;
			val1	=	b;
			System.out.println(val1);

	}

}
