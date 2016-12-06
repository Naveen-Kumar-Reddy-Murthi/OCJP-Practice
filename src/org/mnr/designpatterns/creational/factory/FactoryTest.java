package org.mnr.designpatterns.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer("pc", "intel", "wsd-1tb", "8gb");
		Computer server= ComputerFactory.getComputer("server", "linux", "wsd-5tb", "24gb");
		System.out.println(pc);
		System.out.println(server);

	}

}
