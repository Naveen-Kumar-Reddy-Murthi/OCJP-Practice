package org.mnr.interview;

import java.security.Permission;

public class DoNotTerminate {

	public static class ExitTrappedException extends SecurityException {
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
	
	public static void main(String...args){
		DoNotTerminate.forbidExit();
		System.out.println("start");
//		System.exit(0);
		System.out.println("end");
		
	}

}
