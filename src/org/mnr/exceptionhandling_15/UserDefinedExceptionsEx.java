package org.mnr.exceptionhandling_15;

public class UserDefinedExceptionsEx {

	
	public static void main(String...args)/*throws MyCheckedException*/{
		
//		m1(-12);//since m1 throws unchecked exception, there's no need to catch or delegate 
		
		try{
		m2(10);//Without throws/try-catch CE:Unhandled exception type MyCheckedException
		}
		catch(Exception ex){
			ex.printStackTrace();
		} catch (MyCheckedException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace(); 
			
		}
		
	}
	
	private static void m1(int param) throws MyUncheckedException{
		
		if(param<0)
			throw new MyUncheckedException("Negative Value Supplied");
		else
			System.out.println("m1 param="+param);
		
	}
	
private static void m2(int param) throws MyCheckedException{
		
		if(param>0)
			throw new MyCheckedException("Positive Value Supplied");
		else
			System.out.println("m2 param="+param);
		
	}
}
