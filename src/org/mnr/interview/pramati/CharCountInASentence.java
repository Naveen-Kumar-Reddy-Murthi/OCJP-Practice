package org.mnr.interview.pramati;


import java.util.HashMap;
import java.util.Scanner;

public class CharCountInASentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input= sc.next();
		
		HashMap<Character, Integer> charMap = new HashMap<Character,Integer>();
		for(char c: input.toCharArray()){
			if(charMap.containsKey(c)){
				charMap.put(c, charMap.get(c)+1);
			}
			else
				charMap.put(c, 1);
		}

		System.out.println(charMap);
	}

}
