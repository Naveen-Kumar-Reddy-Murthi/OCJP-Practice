package org.mnr.mainMethod_3;

public class CommandLineArgsRules {

	public static void main(String[] args) {
		
		System.out.println("CommandLineArgsRules");
		//main method string array length by default is zero.
		/*
		 * Way to call the class with parameters
		 * java org.mnr.mainMethod.CommandLineArgsRules Naveen Reddy Murthi
		 * Here space is the seperator between command line arguments
		 * If you want a space between a command line param, you need to 
		 * enclosed that word/sentence between double quotes like this
		 * java org.mnr.mainMethod.CommandLineArgsRules "My Name is " "Naveen Reddy Murthi"
		 * 
		 */
		System.out.println("array length:"+args.length);
		for(int i=0;i<args.length;i++)
			System.out.println("args["+i+"]	=	"+args[i]);

	}

}
