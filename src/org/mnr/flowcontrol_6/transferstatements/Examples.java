package org.mnr.flowcontrol_6.transferstatements;

public class Examples {

	public static void main(String[] args) {
		//example1();
		
		dangerous();

	}
	
	public static void example1(){
		
		l1:
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(i==j)
//						break ;//some output
//						break l1;//no output
//						continue;//some output
						continue l1;//some output
					 System.out.println(i+" "+j);
				}
			}
		
		
		
	}
	
	public static void dangerous(){
		
		
		/*
		 * In do-while loop continue will not go for first line until checking while loop
		 */
		
		int x=0;
		do{
			x++;
			System.out.println(x);
			if(++x<5)
			 continue;
			 x++;
			 System.out.println(x);
		}
		while(++x<10);
		
	}
	
	

}
