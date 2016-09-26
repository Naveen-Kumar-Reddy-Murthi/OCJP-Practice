package org.mnr.interview;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class FindMissingNumberInASet {
	
	public static void main(String...a){
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the nth number");
		int in=sc.nextInt();
		System.out.println("Enter the number to remove from the set");
		int rem=sc.nextInt();
		  while(rem<0 | rem>in)
			  System.out.println("Number to be removed should be greater than zero and less than equal to Max number");
		   
		Set<Integer> numberSet =new HashSet<Integer>();
		for(int i=1;i<=in;i++)
			numberSet.add(i);
		
		//int remove= new Random().nextInt(50);
		numberSet.remove(rem);
		
		int sum=0;
		
		for(int j: numberSet)
			sum=sum+j;
		
		int sumUptoN=in*(in+1)/2;
		System.out.println("Sum upto "+in +" is:"+sumUptoN);
		int missing=sumUptoN-sum;
		System.out.println("Missing number is:"+missing);
	}

}
