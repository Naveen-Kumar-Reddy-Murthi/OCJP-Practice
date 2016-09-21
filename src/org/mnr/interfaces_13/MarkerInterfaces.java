package org.mnr.interfaces_13;

import java.io.Serializable;
import java.util.RandomAccess;



public class MarkerInterfaces implements Serializable, RandomAccess, Cloneable {
	
	/*
	 * An interface without any methods but with special functionality
	 * Though there are no methods to implement special functionality is obtained by implementing classes
	 * JVM is responsible to give that special features
	 * Ex: Serializable, RandomAccess, Clonable, SingleThreadedModel
	 * This class implements above interfaces. Without having any methods of those interfaces
	 * User defined Marker interfaces are possible but JVM must be customised
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
