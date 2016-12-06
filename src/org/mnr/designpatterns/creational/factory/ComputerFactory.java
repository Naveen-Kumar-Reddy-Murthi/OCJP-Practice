package org.mnr.designpatterns.creational.factory;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String cpu, String hdd, String ram){
		
		if("Pc".equalsIgnoreCase(type))
			return new Pc(cpu, hdd, ram);
		else if("Server".equalsIgnoreCase(type))
			return new Server(cpu, hdd, ram);
		else 
			return null;
		
	}

}
