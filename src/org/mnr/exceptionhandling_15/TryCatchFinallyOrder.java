package org.mnr.exceptionhandling_15;

public class TryCatchFinallyOrder {

	public static void main(String[] args) {
		
		try{//try either must be followed by catch block or finally
			//try either must be followed by catch or finally
			// no other way is legal
			System.out.println("try");
			//System.out.println(0/0);
			System.out.println("after exception");
		}
//		catch(Exception e){}
		finally{System.out.println("finally");}

	}

}
