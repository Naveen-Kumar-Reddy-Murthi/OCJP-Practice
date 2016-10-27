package org.mnr.algonote;

import java.util.Arrays;

public class MergeManyArrays {

	public static void main(String[] args) {
		
		int[] src1={1,2,3,4,5};
		int[] src2={6,7,8,9,10};
		int[] src3={11,12,13,14,15};
		int[] src4={16,17,18,19,20};
		int[] dest=new int[src1.length+src2.length+src3.length+src4.length];
		
		int totalLength=src1.length;
		
		System.arraycopy(src1, 0, dest, 0, totalLength);
		System.out.println(Arrays.toString(dest));
		
		System.arraycopy(src2, 0, dest, totalLength,src2.length );
		totalLength=totalLength+src2.length;
		System.out.println(Arrays.toString(dest));

		System.arraycopy(src3, 0, dest, totalLength, src3.length);
		System.out.println(Arrays.toString(dest));
		totalLength=totalLength+src3.length;
		
		System.arraycopy(src4, 0, dest, totalLength, src4.length);
		System.out.println(Arrays.toString(dest));
	}

}
