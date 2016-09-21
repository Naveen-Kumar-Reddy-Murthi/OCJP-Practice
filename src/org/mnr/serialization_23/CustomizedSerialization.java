package org.mnr.serialization_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException { 
		/*
		 * In default serialzation, there are restrictions because of transient 
		 * keyword
		 * We can change that behaviour using custom implementation
		 * To achieve this following two callback methods need to be implemented in
		 * serializable class
		 * 1. private void writeObject(ObjectOutpurStream oos){};
		 * 2. private void readObject(ObjectInputStream ois){};
		 * Though above two callback methods are automatically called by jvm during 
		 * serializagion and deserialization respectively.
		 * Though these two methods are private, jvm can still able to call these methods
		 * Ex: See User class custom serialization implementation
		 */
		
			User user = new User("Naveen", "valarmorghilis@8",1);
			
			FileOutputStream fos	=	new FileOutputStream("user.ser");
			ObjectOutputStream oos	=	new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			
			FileInputStream fis	=	new FileInputStream("user.ser");
			ObjectInputStream ois	=	new ObjectInputStream(fis);
			
			User user1	=	(User) ois.readObject();
			System.out.println(user1);

	}

}

class User implements Serializable{
	
	private String userName;
	private transient String password;
	private transient int id;
	
	User(String userName, String password, int id){
		this.userName=userName;
		this.password=password;
		this.id=id;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		System.out.println("JVM invoked writeObject");
		oos.defaultWriteObject();
		String ePwd	="123"+this.password;
		oos.writeObject(ePwd);
		int id=84561+this.id;
		oos.writeInt(id);
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		System.out.println("JVM invoked readObject");
		ois.defaultReadObject();
		String ePwd	=	(String) ois.readObject();
		this.password=ePwd.substring(3);
		int id=(int) ois.readInt();
		this.id=id-84561;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", id=" + id + "]";
	}
	
	
}
