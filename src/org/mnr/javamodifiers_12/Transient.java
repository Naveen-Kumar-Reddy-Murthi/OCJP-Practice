package org.mnr.javamodifiers_12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transient implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	public transient int val=250;

	public static void main(String[] args) {
		
		/*
		 * transient keyword only applicable for variables
		 * It is to achieve opposite of serialization
		 * trasient variables are not serialized
		 * Jvm ignores their values and provides default values
		 */
		
		Transient tran	= 	new Transient();
		
		
		try{
			
			FileOutputStream fout	= 	new FileOutputStream("C:\\Users\\Naveen Reddy\\Desktop\\obj.ser");
			ObjectOutputStream	oout=	new ObjectOutputStream(fout);
			oout.writeObject(tran);
			
			System.out.println("Reading directly from memory:"+tran.toString());
			
			FileInputStream fin		= 	new FileInputStream("C:\\Users\\Naveen Reddy\\Desktop\\obj.ser");
			ObjectInputStream ois	=	new ObjectInputStream(fin);
			tran=(Transient) ois.readObject();
			
			System.out.println("Reading from serialized object:"+tran.toString());
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return "Transient [val=" + val + "]";
	}
	
	

}
