package org.mnr.regex_28;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClassSplit {

	public static void main(String[] args) {
		
		Pattern pattern =	Pattern.compile("\\s");
		String[] words	=	pattern.split("My Name is Naveen Reddy");
		System.out.println(Arrays.toString(words));
		
		pattern =	Pattern.compile("\\.");//we can supply [.] too
		//or
		pattern =	Pattern.compile("[.]");
		words	=	pattern.split("www.google.co.in");
		System.out.println(Arrays.toString(words));
			
		/**
		 * Both String and Pattern classes have split()
		 * Diff is Pattern.split(String s) takes string as parameter
		 * wherea as String.split(String regex) takes regext pattern as parameter in string form
		 */
		
		 String website	=	"www.news.google.co.in";
		 words			= website.split("[.]");
		 //or
//		 words			= website.split("\\."); 
		 System.out.println(Arrays.toString(words));
	}

}
