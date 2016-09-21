package org.mnr.regex_28;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		/**
		 * default regex pattern is space
		 */
//		StringTokenizer tokenizer	=	new StringTokenizer("I am Naveen Reddy");//defualt split pattern is space
		StringTokenizer tokenizer	=	new StringTokenizer("I-am-Naveen-Reddy","-");
		
		while(tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextToken());
	}

}
