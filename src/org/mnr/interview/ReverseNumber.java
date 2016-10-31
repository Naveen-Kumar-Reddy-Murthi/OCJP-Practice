package org.mnr.interview;

public class ReverseNumber {

	public static void main(String[] args) {
		int input=987654321;
		int reverse=0;
		int temp=0;
		while(input>0){
			temp= (input%10);
			reverse=( reverse*10)+temp;
			input=input/10;
			
		}
		System.out.println(reverse);
	}

}
