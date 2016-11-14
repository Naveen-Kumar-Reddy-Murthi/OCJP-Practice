package org.mnr.interview;

public class StringLengthWOLengthMethod {

	public static void main(String[] args) {
		
		String input="Naveen";
		System.out.println(input.lastIndexOf(""));
		int i=0;
		for(char c:input.toCharArray())
			i++;
		
		System.out.println(i);

	}

}
