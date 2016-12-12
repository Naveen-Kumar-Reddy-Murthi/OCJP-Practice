package org.mnr.designpatterns.creational.factory;

public class ComputerFactory_Abstract {
	
	public static Computer createComputer(ComputerAbstractFactory factory){
		
		return factory.createComputer();
		
	} 

}
