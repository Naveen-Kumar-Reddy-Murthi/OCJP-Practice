package org.mnr.typecasting_5;

public class ExplicitCasting {

	public static void main(String[] args) {
		/*
		 * It's performed by programmer manualy
		 * It's when we are assigning bigger data type value to smaller data type
		 * It's also called norrowing and downcasting
		 * There's a good chance that data is lost while doing this
		 */
		
		
		
		
		/*
		 * 	Following is the upcasting precedence
		 * 
		 * 		byte	<--short <-|
		 * 						    --	int	<--long	<--float  <--double
		 * 				  char	 <-|
		 */
		
		    int x	=10;
		    short s =(short)x;//here we have to explicitly cast x to short otherwise CE
		    byte  b	=(byte)x;//here also we have to explicitly cast x to byte
		    
		    System.out.println(s);
		    System.out.println(b);
		/*
		 * Whenever we are assigning bigger data type values
		 * most significant bits will be lost
		 * Refer the following example
		 */
			
		    int 	intVal		=	150;
		    short	shortVal	=	(short)intVal;
		    System.out.println(shortVal);//150
		    
		    byte	byteVal		=	(byte)intVal;
		    System.out.println(byteVal);//-106
		    
		    
	    /*
	     * If we assign float value to integral datatypes
	     * digits after decimal value will be lost
	     * 
	     */
	    
		    float	fl	= 10.123f;
		    
		    int intVal1	=(int)fl;
		    
		    System.out.println(intVal1);
		    
	}

}
