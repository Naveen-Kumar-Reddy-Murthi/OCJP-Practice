package org.mnr.amazon;

import java.util.Scanner;

public class NumberOfCinS {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String C= s.next();
        String S= s.next();
        int count =0;

//         System.out.println( "C:"+C);
//         System.out.println( "S:"+S);
         int M = C.length();
         int N = S.length();
//         System.out.println( "M:"+M);
         //System.out.println( "N:"+N);
         for(int i=0;i<N;i++){
        	 if(S.substring(i).startsWith(C))
        		 count++;
         }
         System.out.println("count:"+count);
         
	}

}
