package org.mnr.designpatterns.creational.singleton;

public class SingletonLazy {

	private static volatile SingletonLazy instance;

	private SingletonLazy() {
	}

	public static/* synchronized */SingletonLazy getInstance() {

		// to make this synchronized either we can make this method as
		// synchronized or
		// block where singleton object is being used

		if (instance == null) {
			synchronized (SingletonLazy.class) { // double checked locking

				instance = new SingletonLazy();

			}
		}
		return instance;

	}

}
