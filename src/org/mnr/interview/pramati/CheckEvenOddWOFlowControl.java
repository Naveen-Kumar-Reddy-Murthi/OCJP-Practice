package org.mnr.interview.pramati;

import java.util.Scanner;

public class CheckEvenOddWOFlowControl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = Integer.parseInt(sc.next());
		//System.out.println("input:"+input);
		String []arr = {"Even","Odd"};
		System.out.println(arr[input%2]);

	}

}
