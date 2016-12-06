package org.mnr.designpatterns.creational.factory;

public class Pc extends Computer {
	
	private String  cpu;
	private String  hdd;
	private String  ram;
	
	public Pc(String  cpu, String  hdd, String  ram){
		this.cpu=cpu;
		this.hdd=hdd;
		this.ram=ram;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

}
