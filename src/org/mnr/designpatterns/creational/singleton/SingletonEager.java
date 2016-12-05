package org.mnr.designpatterns.creational.singleton;

public final class SingletonEager {

//	 private static volatile SingletonEager INSTANCE1 = new SingletonEager();

	// or
	private static volatile SingletonEager instance;
	static {
		// Only diff of this type of initialization from above is
		// here we can handle exception while initializing the singleton object
		// otherwise both are same.
		try {
			instance = new SingletonEager();
		} catch (Exception exception) {

			System.out.println("Expection while initializing SingletonEager");
		}
	}

	private SingletonEager() {
		// protected can also be used but singleton class should be alone in its
		// package
		// so that other package
	}

	public static synchronized SingletonEager getInstance() {

		return instance;
	}

}
