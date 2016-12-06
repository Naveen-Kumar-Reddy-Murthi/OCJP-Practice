package org.mnr.designpatterns.creational.factory;

public abstract class Computer {
	
	public abstract String getCPU();
	public abstract String getHDD();
	public abstract String getRAM();
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computer [getCPU()=");
		builder.append(getCPU());
		builder.append(", getHDD()=");
		builder.append(getHDD());
		builder.append(", getRAM()=");
		builder.append(getRAM());
		builder.append("]");
		return builder.toString();
	}

	
	
}
