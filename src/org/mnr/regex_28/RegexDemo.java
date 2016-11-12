package org.mnr.regex_28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		/**
		 * 
		 */
		int count=0;
		Pattern pattern	=	Pattern.compile("ab");//pattern object which takes pattern to be matched
		Matcher matcher	=	pattern.matcher("abbabbba");//matcher object which takes target string in which pattern to be searched
		System.out.println(matcher.find());
		while(matcher.find()){
			++count;
			System.out.println(matcher.start()+" | "+matcher.end() +" | "+matcher.group());
		}
		
		/**
		 * some pattern examples
		 * [abc]		--> either a or b or c
		 * [^abcc]		--> except a and b and c
		 * [a-z]		--> any alphabet between a and z
		 * [A-Z]		--> any alphabet between A and Z
		 * [a-zA-z]		--> any alphabet
		 * [0-9]		--> any digit between 0 and 9
		 * [0-9a-zA-z]	--> any alphabet and any digit between 0-9
		 * [^0-9a-zA-z]	--> except alpha-numerical characters
		 */
		
//		pattern	=	Pattern.compile("[abc]");
//		pattern	=	Pattern.compile("[^abc]");
//		pattern	=	Pattern.compile("[A-Z]");
//		pattern	=	Pattern.compile("[^A-Z]");
//		pattern	=	Pattern.compile("[a-z]");
//		pattern	=	Pattern.compile("[^a-z]");
//		pattern	=	Pattern.compile("[0-9]");
//		pattern	=	Pattern.compile("[^0-9]");
//		pattern	=	Pattern.compile("[a-zA-Z0-9]");
		pattern	=	Pattern.compile("[^a-zA-Z0-9]");
		matcher	=	pattern.matcher("a3b#k@9zBC");
		while(matcher.find()){
			System.out.println(matcher.start()+" | "+matcher.end() +" | "+matcher.group());
		}
		
		
		
		

	}

}
