package org.mnr.regex_28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

	public static void main(String[] args) {
		/**
		 * Mobile number validation conditions
		 * 1. Every mobile number should contain exactly 10 digits
		 * 2. First digit should either be 7/8/9
		 */
		Scanner scanner;
		Pattern pattern;
		Matcher matcher;
		
		scanner	=	new Scanner(System.in);
		String input	=	scanner.next();
		/**
		 * in below pattern regex each square brace enclosing([]) represents
		 * condtion for each character of input string
		 */
//		 pattern	=	Pattern.compile("[789][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		 	//or
//		 pattern	=	Pattern.compile("[7-9][0-9]{9}");//here {9} represents no of repeatetions for [0-9] condition
		    //or
		 
		 /**
		  * condition mobile number should either be 10 or 11 digit
		  */
		 
		 pattern	=	Pattern.compile("0?[7-9][0-9]{9}");
		 
		 /**
		  * condtion: mobile number should either be 10/11/12 digit
		  */
		 
//		 pattern	=	Pattern.compile("(0/91)?[7-9][0-9]{9}");//(0/91)? represents string should start either with  0 or 91 but only once(?)
		 matcher	=	pattern.matcher(input);
		
		if(matcher.find())
			System.out.println("valid mobile number");
		else
			System.out.println("invalid mobile number");

	}

}
