package org.mnr.designpatterns.creational.factory;

public class ServerFactory implements ComputerAbstractFactory {
	
	private String  cpu;
	private String  hdd;
	private String  ram;
	
	public ServerFactory(String  cpu, String  hdd, String  ram){
		this.cpu=cpu;
		this.hdd=hdd;
		this.ram=ram;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(cpu,hdd,ram);
	}

}
