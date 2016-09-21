package org.mnr.regex_28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaIdentifiersValidation {

	public static void main(String[] args) {
	/**
	 * allowed characters are a-z,A-Z,0-9,$,#
	 * length of each identifier should be atleast 2
	 * first character should be lowecase alphabet between a-k
	 * second character should be a digit divisible by 3(0,3,6,9)
	 * 
	 */
		
		Scanner scanner	=	new Scanner(System.in);
		String input=scanner.next();
		
		
		Pattern pattern	=	Pattern.compile("[a-k][0369][a-zA-z0-9$#]*");
		Matcher matcher	=	pattern.matcher(input);
		
		if(matcher.find())
			System.out.println("valid");
		else
			System.out.println("invalid");
		
		

	}

}
