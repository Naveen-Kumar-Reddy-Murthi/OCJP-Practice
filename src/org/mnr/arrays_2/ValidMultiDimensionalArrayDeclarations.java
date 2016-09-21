package org.mnr.arrays_2;

import java.util.Arrays;

public class ValidMultiDimensionalArrayDeclarations {

	public static void main(String[] args) {

		// Following is valid and other two dimensions can be given individually
		int[][][] a = new int[3][3][];

		a[0][0] = new int[1];
		a[0][1] = new int[2];
		a[0][2] = new int[3];
		a[1][0] = new int[4];
		a[1][1] = new int[5];
		a[1][2] = new int[6];
		a[2][0] = new int[7];
		a[2][1] = new int[8];
		a[2][2] = new int[9];
		int m = 0;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				for (int k = 0; k < a[i][j].length; k++)
				// System.out.println("a["+i+"]["+j+"]'s length:"+a[i][j].length);
				{
					a[i][j][k] = m++;
				}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					// System.out.print(a[i][j][k]+" ");
					// System.out.println(Arrays.toString(a[i][j]));
				}
				// System.out.println();
			}
		}

		// Following is invalid because we can't specify the third dimension
		// without having second dimension.
		// int [][][] b= new int[3][][5];

		// Following is another way of representing a multidimensional array

		int threeD[][][] = new int[3][4][5];
		int p, q, r;
		for (p = 0; p < 3; p++)
			for (q = 0; q < 4; q++)
				for (r = 0; r < 5; r++)
					threeD[p][q][r] = p * q * r;
		for (p = 0; p < 3; p++) {
			for (q = 0; q < 4; q++) {
				for (r = 0; r < 5; r++) {
					System.out.print(threeD[p][q][r] + " ");

				}
				System.out.println();
			}
		}
	}

	// Following array is initialised at the time of declaration.
	
//	double TwoD[][] = { 
//						{ 0*0, 1*0, 2*0, 3*0 }, 
//						{ 0*1, 1*1, 2*1, 3*1 }, 
//						{ 0*2, 1*2, 2*2, 3*2 }, 
//						{ 0*3, 1*3, 2*3, 3*3 } 
//					};
//	
//			for(int s=0; s<4; s++) { 
//			for(int t=0; t<4; t++) 
//			System.out.print(TwoD[s][t] + " "); 
//			System.out.println(); 
//			} 
//			} 
	
	
}
