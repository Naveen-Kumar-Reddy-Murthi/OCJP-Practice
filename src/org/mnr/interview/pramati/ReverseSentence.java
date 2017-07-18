package org.mnr.interview.pramati;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		System.out.println(reverse(input));

	}
	
	public static String reverse(String input){
		StringBuilder sb = new StringBuilder("");
		
		String words[] = input.split(" ");
		for(int i=words.length-1; i>=0;i--){
			sb.append(words[i]).append(" ");
		}
		
		
		return sb.toString();
	}

}
