package org.mnr.designpatterns.creational.singleton;

enum SingletonEnum
{
	INSTANCE;
	//by default INSTANCE is thread-safe but other methods inside enum aren't by default
	// this has to be taken care by programmer using synchronization.
	  
	  private int state = 0;
	  
	  public void DoSomething() {//
	    ++state;
	    System.out.println("I did something for the " + state + " time");
	  }
}
