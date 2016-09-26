package org.mnr.interview;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
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

}
