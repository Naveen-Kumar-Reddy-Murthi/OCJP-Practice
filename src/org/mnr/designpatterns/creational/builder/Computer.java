package org.mnr.designpatterns.creational.builder;

public class Computer {

	private String hdd;
	private String ram;
	private String cpu;
	
	private boolean isGraphicCardEnabled;
	private boolean isWifiEnabled;
	
	public String getHdd() {
		return hdd;
	}
	public String getRam() {
		return ram;
	}
	public String getCpu() {
		return cpu;
	}
	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}
	public boolean isWifiEnabled() {
		return isWifiEnabled;
	}
	
	private Computer(ComputerBuilder builder){
		
		this.hdd=builder.hdd;
		this.cpu=builder.cpu;
		this.ram=builder.ram;
		this.isGraphicCardEnabled=builder.isGraphicCardEnabled;
		this.isWifiEnabled=builder.isWifiEnabled;
		
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computer [hdd=");
		builder.append(hdd);
		builder.append(", ram=");
		builder.append(ram);
		builder.append(", cpu=");
		builder.append(cpu);
		builder.append(", isGraphicCardEnabled=");
		builder.append(isGraphicCardEnabled);
		builder.append(", isWifiEnabled=");
		builder.append(isWifiEnabled);
		builder.append("]");
		return builder.toString();
	}



	public static class ComputerBuilder{
		
		private String hdd;
		private String ram;
		private String cpu;
		
		private boolean isGraphicCardEnabled;
		private boolean isWifiEnabled;
		

		public ComputerBuilder  setGraphicCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}

		public ComputerBuilder  setWifiEnabled(boolean isWifiEnabled) {
			this.isWifiEnabled = isWifiEnabled;
			return this;
		}

		public ComputerBuilder(String hdd, String ram,String cpu){
			this.hdd=hdd;
			this.ram=ram;
			this.cpu=cpu;
			
		}
		
		public Computer build(){
			return new Computer(this);
		}
		
	}
	
}
