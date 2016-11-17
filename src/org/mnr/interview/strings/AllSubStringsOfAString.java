package org.mnr.interview.strings;

public class AllSubStringsOfAString {

	public static void main(String[] args) {
		String input="naveen";
		String sub  = null;
		for(int i=0;i<input.length();i++){
			
			for(int j=0;j<input.length()-i+1;j++){
				System.out.println(input.substring(i,i+j));
			}
		}

	}

}
