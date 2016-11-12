package org.mnr.regex_28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressValidation {

	public static void main(String[] args) {
		/**
		 * coditions
		 * 1. validate the input string as an email address
		 */
		Scanner scanner;
		Pattern pattern;
		Matcher matcher;
		
		scanner = new Scanner(System.in);
		String input	=	scanner.next();
		scanner.close();
		
		pattern	=	Pattern.compile("[a-zA-Z0-9_.]*@[a-zA-Z0-9]+[.]([a-zA-Z])");
//		pattern=	Pattern.compile("[0-9a-zA-Z]*@gmail.com");
		
		matcher	=	pattern.matcher(input);
		if(matcher.find())
			System.out.println("valid email address");
		else
			System.out.println("invalid email address");
		

	}

}
