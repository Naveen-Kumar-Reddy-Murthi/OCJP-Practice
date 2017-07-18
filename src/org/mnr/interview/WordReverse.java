package org.mnr.interview;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
//		reverseWOAPI(input);
		reverseWAPI(input);
	}
	
	public static void reverseWOAPI(String input){
		
		StringBuffer sb=new StringBuffer();
		String temp="";
		while(input.contains(" ")){//my name is naveen reddy murthi
			temp=input.substring(input.lastIndexOf(" ")+1, input.length());
			sb.append(temp);
			sb.append(" ");
			input=input.substring(0,input.lastIndexOf(" "));
		}
		sb.append(input);
		System.out.println("output::"+sb.toString());
		
	}
	
	public static void reverseWAPI(String input){
		
		String[] words = input.split(" ");
		
		StringBuilder sb	=	new StringBuilder("");
		
		for(int i=words.length-1; i>=0; i--)
			sb.append(words[i]).append(" ");
		
		System.out.println("output::"+sb.toString());
		
	}

}
