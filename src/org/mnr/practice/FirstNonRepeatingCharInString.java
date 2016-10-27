package org.mnr.practice;

public class FirstNonRepeatingCharInString {

	
	public static void getFirstNonRepeatingCharInString(String input,int index){
		
		int count = 0;

		if (!"".equals(input) || input != null) {

			for (char ch : input.toCharArray()) {

				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
//					count++;
//					if (count == 0) //{
						System.out.println("First Non repeating character in " + input
								+ " is:"+ch);
//						break;
//					}
				}
			}

		}
	}
}
