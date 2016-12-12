package org.mnr.designpatterns.creational.builder;

public class BuilderTest {

	public static void main(String[] args) {
		//getting builder object in single line of code
		
		Computer computer = new Computer.ComputerBuilder("500GB", "8GB", "INTEL")
								.setGraphicCardEnabled(true).setWifiEnabled(false).build();
		System.out.println(computer);

	}

}
