package org.mnr.regex_28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClasses {

	public static void main(String[] args) {
		/**
		 * Predefined character classes
		 * \s  : space character
		 * \S  : except space character
		 * \d  : any digit from 0-9
		 * \D  : except digit any character
		 * \w  : any word characters i.e, alpha numeric
		 * \W  : except word characters i.e., special characters
		 * .   : any character
		 */
		
		Pattern pattern	=	Pattern.compile("x");
		
//		pattern	=	Pattern.compile("\\s");//finds the space
//		pattern	=	Pattern.compile("\\S");// except space, finds eveything
//		pattern	=	Pattern.compile("\\d");// finds any digit between 0-9
//		pattern	=	Pattern.compile("\\D");// finds anything except digit
//		pattern	=	Pattern.compile("\\w");// finds any character but special characters
//		pattern	=	Pattern.compile("\\W");// finds only special characters
		Matcher matcher	=	pattern.matcher("a7bx #!k@9z&%^$)(");
//		while(matcher.find()){
//			System.out.println(matcher.start()+" | "+matcher.end() +" | "+matcher.group());
//		}
		
		
		/**
		 * Qunatifiers
		 * 
		 * a	--> exactly one 'a'
		 * a+	--> atleast one 'a' or more
		 * a*	--> any no of a's including zero number
		 * a?	--> atmost one a
		 */
//		pattern	=	Pattern.compile("a");
//		pattern	=	Pattern.compile("a+");
//		pattern	=	Pattern.compile("a*");
		pattern	=	Pattern.compile("a?");
		matcher	=	pattern.matcher("abaabaaab");
		while(matcher.find()){
			System.out.println(matcher.start()+" | "+matcher.end() +" | "+matcher.group());
		}


	}

}
