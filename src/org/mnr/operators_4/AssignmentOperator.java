package org.mnr.operators_4;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		
		/*
		 * simple assignment
		 */
			
			int x=10;
			
		/*
		 * Chained assignment
		 */
			
			int a,b,c,d,e;
			a=b=c=d=e=25;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
		
		/*
		 * Following is illegal way to do it
		 */
			
//			int x=y=z=w=10;
			
			
		/*
		 * Compound assignment
		 * here both assignment and arithmetic operators are used 
		 * +=,-=,/=,%=,&=,^=,|^,>>=,>>>=,<<=
		 * In this case type casting is implicit
		 * Jvm will do it automatically 
		 */
			
			byte by=10;
			by	= (byte) (by+1);// here as it is a noram assignment using addition, we need to typecast it to byte type
			
		/*
		 * But in-case of compound assignment operators
		 * jvm will automatically do it
		 */
			
			int byt	=	10;
				byt++;
				System.out.println(byt);//internally this means byt=(byte)byt+1;
				
		/*
		 * compound assignment 
		 */
		
				a+=	b-=	c*= d/=25;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			
	}

}
