package org.mnr.internationalization_27;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		/**
		 * default DateFormat examples
		 * DateFormat is an abstract class
		 * methods:
		 * 1. public static DateFormat getInstance()
		 * 2. public static DateFormat getDateInstance()
		 * 3. public static DateFormat getDateInstance(int style)
		 * 3. public static DateFormat getDateInstnace(int style, Locale locale)
		 */
		
		Date date	=	new Date();
		DateFormat us	=	DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		DateFormat uk	=	DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		DateFormat ind	=	DateFormat.getDateInstance(DateFormat.LONG, new Locale("en","IN"));
		System.out.println("Long Format");
		System.out.println("india: "+ind.format(date));
		System.out.println("us   : "+us.format(date));
		System.out.println("uk   : "+ind.format(date));
		System.out.println();
		DateFormat us1	=	DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		DateFormat uk1	=	DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
		DateFormat ind1	=	DateFormat.getDateInstance(DateFormat.FULL, new Locale("en","IN"));
		System.out.println("Full Format");
		System.out.println("india: "+ind1.format(date));
		System.out.println("us   : "+us1.format(date));
		System.out.println("uk   : "+ind1.format(date));
		System.out.println();
		
		DateFormat us2	=	DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
		DateFormat uk2	=	DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
		DateFormat ind2	=	DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("en","IN"));
		System.out.println("Medium Format");
		System.out.println("india: "+ind2.format(date));
		System.out.println("us   : "+us2.format(date));
		System.out.println("uk   : "+ind2.format(date));
		System.out.println();
		DateFormat us3	=	DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		DateFormat uk3	=	DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
		DateFormat ind3	=	DateFormat.getDateInstance(DateFormat.SHORT, new Locale("en","IN"));
		System.out.println("Short Format");
		System.out.println("india: "+ind3.format(date));
		System.out.println("us   : "+us3.format(date));
		System.out.println("uk   : "+ind3.format(date));
		
		System.out.println("All date format styles in India:");
		DateFormat india	=  DateFormat.getDateInstance(0,new Locale("en","IN"));
		System.out.println(DateFormat.getDateInstance(0,new Locale("en","IN")).format(date));
		System.out.println(DateFormat.getDateInstance(1,new Locale("en","IN")).format(date));
		System.out.println(DateFormat.getDateInstance(2,new Locale("en","IN")).format(date));
		System.out.println(DateFormat.getDateInstance(3,new Locale("en","IN")).format(date));
	}

}
