package org.mnr.interview;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int input=121;
		if(input==reverse(input))
			System.out.println(input+" is a palindrome number");
		else
			System.out.println(input+" is not a palindrome number");

	}
	public static int reverse(int input){
		
		int reverse=0;
		int temp=0;
		
		while (input>0){
			
			temp=input%10;
			reverse=(reverse*10)+temp;
			input=input/10;
			
		}
		
		return reverse;
	}
}
