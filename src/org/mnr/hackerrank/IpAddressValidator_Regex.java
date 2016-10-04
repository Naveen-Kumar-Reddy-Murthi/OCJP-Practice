package org.mnr.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressValidator_Regex {

	public static void main(String[] args) {
		
		   String ip="000.12.12.034";
		   
		   String match="^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$[.]"
		   				+ "^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$[.]"
		   				+ "^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$[.]"
		   				+ "^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";

			Pattern pattern	= Pattern.compile(match);
			//^[0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}$
			//^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$
			Matcher matcher = pattern.matcher(ip);
			System.out.println(matcher.find());

	}

}
