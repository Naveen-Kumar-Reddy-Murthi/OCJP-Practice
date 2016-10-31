package org.mnr.interview;

import java.util.Arrays;

public class StringPalindrome {

	public static void main(String[] args) {
		String input="aka";
		
		if(input.equals(reverse(input)))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static String reverse(String input){

		StringBuilder sb = new StringBuilder("");
		int length=input.length()-1;
		for(int i=length;i>=0;i--){
			sb.append(input.charAt(i));
		}
		return sb.toString();
		
	}
}
