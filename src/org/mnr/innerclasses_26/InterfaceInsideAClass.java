package org.mnr.innerclasses_26;

public class InterfaceInsideAClass {
	/**
	 * If there are multiple implementations of an interface and all these
	 * implementations are related to one particular object then we can define
	 * that interface inside a class
	 */
}

class VehicleType {
	interface Vehicle {
		public int getNoOfWheels();
	}

	class Bus implements Vehicle {

		@Override
		public int getNoOfWheels() {
			return 4;
		}

		class Auto implements Vehicle {

			@Override
			public int getNoOfWheels() {
				return 3;
			}

		}
	}
}