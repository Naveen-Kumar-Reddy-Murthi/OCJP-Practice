package org.mnr.packages_java_lang_21;

public class WrapperClasses {

	public static void main(String[] args) {
		
//		concept();
		wrapperUtilityMethods();
	}
	
	public static void concept(){
		/*
		 * Wrapper classes are used to wrap primitives in the form of objects
		 * Almost all wrapper classes contain two constructors like following
		 */
		
		Integer intVal1	=	new Integer(10);
		Integer intVal2	=	new Integer("100");
		Float floatVal1	=	new Float(10.5f);
		Float floatVal2	=	new Float("17.1255f");
		
		System.out.println("intVal1:"+intVal1);
		System.out.println("intVal2:"+intVal2);
		System.out.println("floatVal1:"+floatVal1);
		System.out.println("floatVal2:"+floatVal2);
		
		/*
		 * But Character object contains only one constructor i..e, one with the character 
		 */
		
		Character char1	=	new Character('a');
//		Character char2	=	new Character("a");//CE:The constructor Character(String) is undefined
		System.out.println("char1:"+char1);
		
		/*
		 * Boolean class takes both string type input and primitive type input
		 * incase of string type, it can be caseinsensitive  primitive type
		 * any other value than true/false will be considered as false
		 * 
		 */
		
			Boolean bool1	=	new Boolean(true);
			Boolean bool2	= 	new Boolean("TrUE");
			Boolean bool3	=	new Boolean("fALse");
			Boolean bool4	=	new Boolean("no");
			System.out.println("bool1:"+bool1);
			System.out.println("bool2:"+bool2);
			System.out.println("bool3:"+bool3);
			System.out.println("bool4:"+bool4);
	}
	
	public static void wrapperUtilityMethods(){
		/*
		 * There are four utility methods in all wrapper classes
		 * 1.valueOf()
		 * 2.xxxValue()
		 * 3.parseXXX()
		 * 4.toString()
		 */
		
		/*
		 * valueOf: used to create wrapper object for given string
		 * 
		 */
		
		Integer val1	=	Integer.valueOf(10);
		Integer val2	=	Integer.valueOf("100",4);
		System.out.println("val1:"+val1);
		System.out.println("val2:"+val2);
		
		System.out.println(val1.intValue());//returnds prmitive value of wrapper object
		
		int a=Integer.parseInt("123");
		System.out.println("Parsed integer value:"+a);
		
		System.out.println(val1.toString());
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		
	}

}
