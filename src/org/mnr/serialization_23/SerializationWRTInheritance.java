package org.mnr.serialization_23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationWRTInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		 * In inheritance, serialization is also inheritable i.e.,
		 * if parent is serializable then child also serializable
		 */
		
		Car car	=	new Car();
		
		FileOutputStream fos	=	new FileOutputStream("car.ser");
		ObjectOutputStream oos	=	new ObjectOutputStream(fos);
		
			oos.writeObject(car);
			
	    FileInputStream fis	=	new FileInputStream("car.ser");
	    ObjectInputStream ois=	new ObjectInputStream(fis);
			
		Car car1	=	(Car) ois.readObject();
		System.out.println(car1);
		
		/** We can also serialize child class eventhough parent isn't
		 * serializable. In this case child class must be serializable
		 * In this case jvm will check whether child class is using
		 * any non-serialziable parent variables. If there are any jvm
		 * initialize them to default values
		 * In this case non-serializable parent class must have a default
		 *  constructor. Otherwise InvalidClassException wil bet thrown.
		 *  Re-read pg. no 410
		 */
		Civic civic	=	new Civic(123);
		
		fos	=	new FileOutputStream("civic.ser");
		 oos	=	new ObjectOutputStream(fos);
		
			oos.writeObject(civic);
			
			fis	=	new FileInputStream("civic.ser");
		     ois=	new ObjectInputStream(fis);
				
			Civic civic1	=	(Civic) ois.readObject();
			System.out.println(civic1);
			/*
			 * 
			 */

	}

} 

class Vehicle implements Serializable{
	private int vehicleId=10;
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}
}

class Car extends Vehicle{
	private int carId=120;
	@Override
	public String toString() {
		return "Car [carId=" + carId + "]";
	} 
}

class Hundai {
	Hundai(){
		
	}
	
	Hundai(int id){
		this.hundiaId=id;
		this.model="Hundai V12E345";
	}
	 int hundiaId;
	 String model;
	
}

class Civic extends Hundai implements Serializable{
	Civic(int id) {
//		super(id);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int civicId=super.hundiaId;

	@Override
	public String toString() {
		return "Civic [civicId=" + civicId + ", model=" + model + "]";
	}
	
}