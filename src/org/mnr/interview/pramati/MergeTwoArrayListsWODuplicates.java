package org.mnr.interview.pramati;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoArrayListsWODuplicates {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		 list1.add(1);
		 list1.add(1);
		 list1.add(3);
		 list1.add(5);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		 list2.add(2);
		 list2.add(4);
		 list2.add(6);
		 list2.add(6);
		 list2.add(8);
		 list2.add(10);
		
		Set<Integer>  finalSet = new TreeSet<Integer>();
		finalSet.addAll(list1);
		finalSet.addAll(list2);
		System.out.println(finalSet);

	}

}
