package org.mnr.interview;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		System.out.println("Enter highest number in the series..\n");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int sum=0;
		int arrSum=0;
		System.out.println("Enter values..\n");
		for(int i=1;i<size;i++)
			arrSum=arrSum+sc.nextInt();
		sum=size+(size*(size+1))/2;
		System.out.println("arrSum="+arrSum);
		System.out.println("sum="+sum);
		System.out.println("Missing Number is:"+(sum-arrSum));
		System.out.println();

	}

}
