package org.mnr.flowcontrol_6.transferstatements;

public class BreakStatement {

	public static void main(String[] args) {
		
		/*
		 * Used for break out of the loop
		 * Widely used in Switch statements for breaking execution parts
		 * Refer org.mnr.flowcontrol6.Switch
		 * This is also used in variou loops
		 * break statement can only be used in switch/for/while/do while loops
		 * but not in selection statements ifelse/nested if else
		 */
		
			/*for(int i=0;i<5;i++){
				
				if(i==1)
					break;
				else
					System.out.println("hi");
			}*/
		
		
		/*
		 * Labelled blocks
		 * break statement can be used with labelled blocks
		 */
			
				/*int x=9;
				lable1:
				{
					System.out.println("Start");
					if(x==10)
						break lable1;
					else
					System.out.println("end");
				}
			System.out.println("hello");*/
		
		
		/*
		 * Inside nested loops	TBD
		 */
			/*int a,b,c;
			l1:
			for( a=0;a<10;a++){
				l2:
					for( b=0;b<10;b++)
					{
						for( c=0;c<10;c++)
						{
								break l1;
								break l2;
								break;
						}
						
					}
			}*/
	}

}
