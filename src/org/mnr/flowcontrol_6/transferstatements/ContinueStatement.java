package org.mnr.flowcontrol_6.transferstatements;

public class ContinueStatement {

	public static void main(String[] args) {

			/*
			 * continue statement used to skip current iteration
			 * in the loop and continue with the next loop
			 */
		
				/*for(int i=0;i<=10;i++){
					if(i%2==0)
						continue;// skips current loop if reminder is zero i.e., prints odd numbers between zero and ten
					System.out.println(i);
				}*/
		
		
			/*
			 * Inside nested loops	TBD
			 
				int a,b,c;
				l1:
				for( a=0;a<10;a++){
					l2:
						for( b=0;b<10;b++)
						{
							for( c=0;c<10;c++)
							{
								if(a==b &&a==c)
								{
									continue l1;
									continue l2;
									continue;
								}
							}
							
						}
				}*/
		
		
		
			/*
			 * It can't be used in labelled blocks
			 */
		
						/*int x=9;
						lable1:
						{
							System.out.println("Start");
							if(x==10)
								continue lable1;//CE:continue cannot be used outside of a loop
							else
							System.out.println("end");
						}
						System.out.println("hello");*/
				
				

	}

}
