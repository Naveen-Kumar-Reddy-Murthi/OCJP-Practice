package org.mnr.interview.pramati;


import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(input==reverse(input)?"Palindrome":"Not a Palindrome");

	}
	
public static int reverse(int input){
		
		int temp =0;
		int reverse =0;
		while(input>0){
			temp=input%10;
			reverse=(reverse*10)+temp;
			input=input/10;
		}
		return reverse;
	}

}
