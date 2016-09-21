package org.mnr.java7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithResources {

	public static void main(String[] args) throws FileNotFoundException, SQLException, IOException {
		/*
		 * prior java7, all the resources need to be declared outside the try
		 * block and all these needed to be closed manually by programmer inside
		 * finally block Additional overhead is to perform null check to avoid
		 * NPE
		 * For this to work, each resource must implement the AutoCloseable interface
		 * This interface contains one method close
		 */
		System.out.println("before concept");
		concept();
			System.out.println("after concept");
	}

	static private void concept() throws SQLException, FileNotFoundException, IOException {
		System.out.println("before try concept");

		try (/*Connection con= DriverManager.getConnection("");*/BufferedReader breader	= new BufferedReader(new FileReader("C:\\Users\\Naveen Reddy\\Desktop\\magnets.txt"));)//here any number of resources can be opened like this by seperating them with ; untill they are autoclosable instances othewise CE
		{
			System.out.println("in try concept");	
//			con= DriverManager.getConnection("");// here con is final by default becuase it is being used with try with resources block ce:The resource con of a try-with-resources statement cannot be assigned
//			con.close();
//			System.out.println(con.isClosed());
			System.out.println("concept done");
		} 
//		catch (Exception ex) {ex.printStackTrace();}//from java7 catch block is alsoe optional. But exceptions must be thrown to caller
//		finally{}

	}

}
