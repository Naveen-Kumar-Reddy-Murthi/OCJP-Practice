package org.mnr.interview;

public class Find_2x2_in_nxn_Matrix 
{

	public static void main(String[] args)
	{
		
		boolean hasGot=false; 
		boolean noMatch= true;
		int count	=1;
		int [][] matrix = new int [][]
							{
								{1,1,1,0,0},
								{1,1,1,0,0},
								{0,0,0,0,0},
								{1,1,0,1,1},
								{1,1,0,1,1}
							};

		int length =matrix.length;

		for(int i=0;i<length;i++)
		{
			for(int j=0;j< matrix[i].length; j++)
			{

				if((i<matrix.length-1 && j<matrix[i].length-1 )&& (matrix[i][j]==1 && matrix[i][j+1]==1))	
				{	
					hasGot = checkNextRow(matrix,i+1,j) ;

					if(hasGot)
						{
								System.out.print((count++)+":- ");
								System.out.print(i+"/"+j+", ");
								System.out.print(i+"/"+(j+1)+", ");
								System.out.print((i+1)+"/"+j+", ");
								System.out.print((i+1)+"/"+(j+1));
								System.out.println();
								noMatch=false;
						}
				}
			}
		}
		
		if(noMatch)
			System.out.println("No Match Found");
	}

	public static boolean checkNextRow(int matrix[][], int row, int column) 
	{
		if (matrix[row][column] == 1 && matrix[row][column + 1] == 1)
			return true;
		return false;

	}

}
