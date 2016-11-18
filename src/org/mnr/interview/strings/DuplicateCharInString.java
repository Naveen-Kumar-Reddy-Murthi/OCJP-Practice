package org.mnr.interview.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String input="naveen";
		
		Set<Character> charSet= new LinkedHashSet<Character>(); 
		
		for(char ch:input.toCharArray()){
			if(input.indexOf(ch)!=input.lastIndexOf(ch))
				charSet.add(ch);
		}
		
		System.out.println(charSet);

	}

}
