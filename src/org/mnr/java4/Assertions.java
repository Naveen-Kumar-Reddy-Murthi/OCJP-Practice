package org.mnr.java4;

public class Assertions {

	public static void main(String[] args) {
		/*
		 * mainly used for debugging purpose
		 * by default assertions are disabled
		 * need to be enabled using jvm option -ea
		 */
//		simpleVerion();
//		augmentedVersion();
//		augmentedVersion1();
		augmentedVersion2();
	}

	public static void simpleVerion(){
		/*
		 * one argument and must be of boolean type
		 * for boolean type braces are optional
		 */
		System.out.println("before assert");
		assert false;//Exception in thread "main" java.lang.AssertionError
		
		//if true then program continues otherwise program will terminate abormally throwing AssertionError
		
		System.out.println("after assert");		
	}
	
	public static void augmentedVersion(){
		/*
		 * it will have two parts in the statementj
		 * first is boolean type
		 * second can be of anything but preferred to be string
		 */
		int x=100;
		System.out.println("before assert");
		assert (x==10):"x is less than 10";//here second part will be printed as part of AssertionError message if first part is false
		//and abnormal termination of program
		System.out.println("after assert");
	}
	
	public static void augmentedVersion1(){
		
		int x=100;
		System.out.println("before assert");
		assert (x==100):(x++);//since here first statement is true hence second won't be executed so no increment
		
		System.out.println("after assert| x="+x);
		System.out.println(x);
	}
	public static void augmentedVersion2(){
		/*
		 * second part can contain method call which has any return type but void type
		 */
		assert (false):m1();
	}
	
	static String m1(){
		System.out.println("m1");
		return "naveen123456";
	}
	
	public static void assertionRutimeJavaOptions(){
		System.out.println("enable  asserions in non system classes: "+" -ea");
		System.out.println("disable asserions in non system classes: "+" -da");
		System.out.println("enable  asserions in system classes: "+" -esa");
		System.out.println("enable  asserions in system classes: "+" -dsa");
		System.out.println("enable  asserions in specific class: "+" -ea:package.className");
		System.out.println("enable  asserions classes in nested packages: "+" -ea:p1.ClassB -ea:p1.p2.ClassD");
		System.out.println("enable asserions in non system classes: "+" -ea");
	}
}
