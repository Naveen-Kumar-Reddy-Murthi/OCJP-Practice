package org.mnr.interview.pramati;

import java.util.HashSet;
import java.util.Set;

public class PairOfElementsOfAnArrayEqualToGivenSum {

	public static void main(String[] args) {
	
		findPair(new int[]{1,2,5,2,0,19,-21},20);
		
	}
	
	public static void findPair(int[] arr,int sum){
		
		Set<Integer> set = new HashSet<Integer>(arr.length-1);
		for(int num:arr){
			
			if(set.contains(sum-num)){
				System.out.println(num+" and "+(sum-num)+" add up to "+ sum);
				
			}
			set.add(num);
		}
		
		System.out.println(set);
	}

}
