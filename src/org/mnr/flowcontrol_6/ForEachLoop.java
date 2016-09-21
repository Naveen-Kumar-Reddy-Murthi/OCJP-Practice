package org.mnr.flowcontrol_6;

public class ForEachLoop {

	public static void main(String[] args) {
		
			/*
			 * Specially designed for arrays and collections
			 * Introduced in java5
			 * Can be used only for arrays and collections
			 * For each loop can be used on iterable objects i.e., which implement Iterable interface
			 * containing iterate method
			 * It can't be used for general purpose looping statements
			 * Using for each loop, we can retrieve elements only in the original order not in 
			 * reverse order 
			 */
		
			/*int []a={1,2,3,4,5,6};
				
				for(int x:a)	//=	for(int i=0;i<x.length;i++)
					System.out.println(x);*/
				
			/*
			 * Iterating through 2-d array
			 */
				
				/*int [][]b={{1,2,3,4,5},{6,7,8}};
				for(int[]c:b)					//= for(int i=0;i<b.length;i++)
					for(int d:c)				//=	for(int j=0;j<b[i].length;j++)
						System.out.println(d);	//=	sop(b[i][j]) */
		
		
			/*
			 * Iterating through 3-d array
			 */
				
				int [][][]e={{{11,22},{333,4444,55555}},{{666666},{77777,88888}}};
				
					for(int i[][]:e)
						for(int j[]:i)
							for(int k:j)
								System.out.println(k);
		
	}

}
