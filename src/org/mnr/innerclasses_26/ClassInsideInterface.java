package org.mnr.innerclasses_26;

public class ClassInsideInterface {

	public static void main(String[] args) {
	
		/**
		 * if a class is closely associated with interface, then
		 * it it recommanded to declare class inside interface
		 * 
		 * There can be a class inside interface to provide default
		 * implementation for that interface
		 * 
		 * Every class inside an interface is public and static by default
		 */
		
		Vehicle.DefaultVehicle defaultVehicle	=	new Vehicle.DefaultVehicle();
		System.out.println(defaultVehicle.getNoOfWheels());
	}

}

interface EmailService{
	public void sendMail(EmailDetails details);
	class EmailDetails{
		String toList;
		String ccList;
		String subject;
		String body;
	}
}

interface Vehicle{
	public int getNoOfWheels();
	class DefaultVehicle{
		public int getNoOfWheels(){
			return 2;
		}
	}
}