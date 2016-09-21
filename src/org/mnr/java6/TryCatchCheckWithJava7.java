package org.mnr.java6;

public class TryCatchCheckWithJava7 {

	public static void main(String[] args)throws Exception {
		/*
		 * up until java6 try block must be followed either by catch or finally
		 */
		try{
			
		}
		catch(Exception e){}
//		finally{}//without finally/catch CE:Syntax error, insert "Finally" to complete BlockStatements

	}

}
