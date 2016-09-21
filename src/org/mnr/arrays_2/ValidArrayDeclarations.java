package org.mnr.arrays_2;

public class ValidArrayDeclarations {
	public static void main(String...args){
		
		int a[];
		int[] b;
		int c[];
		int d [];
		
//		int []e,[]f;	//second array can't have brackets before reference while declaring multiple arrays in same line
//		int [10]g;	// size can't be defined while declaration.
		int[] z = new int[5];//here declaration and creation are in same line so size must be specified
		
//		int[] y;
//		y= new int[10]; these two lines are equal to above line
		
		int[] k= new int[0]; // it it legal to have zero as size of any array but not negative value
		
		int[][] x = new int[10][12];
		System.out.println(x.getClass().getName());// Each type of array has a predefined classes, which are not available to programmer.
		
		int j=19;
		char n='A';
		int[] m;
		m= new int[j];//while creating array i must specify the size
		System.out.println(m.length);
		
		
//		int[] t= new int[Integer.MAX_VALUE]; // Max allowed size of an array, likely results in OutOfMemoryError if there is not enough heap space
		System.out.println(Integer.MAX_VALUE);
		
	}

}
