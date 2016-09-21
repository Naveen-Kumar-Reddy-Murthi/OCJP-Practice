package org.mnr.internationalization_27;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		/**
		 * Different locales have different number formats
		 * Number format can be used to represent the formats according to Locale
		 * NumberForamt is an abstract class
		 */
		
		  double d	=	12.45671234;
		  NumberFormat nf	=	NumberFormat.getNumberInstance(Locale.ITALY);
		  System.out.println("ITALY:"+nf.format(d));//ITALY:12,457
		  nf=NumberFormat.getNumberInstance(new Locale("pa","IN"));
		  System.out.println("India:"+nf.format(d));//India:12.457
		  nf=NumberFormat.getNumberInstance(Locale.UK);//UK:12.457
		  System.out.println("UK:"+nf.format(d));
		  
		  /**
		   * setting max and min integer and fraction digits
		   */
		  
		  nf.setMaximumFractionDigits(5);
		  System.out.println(nf.format(123.456789562));//123.45679
		  nf.setMinimumFractionDigits(3);
		  System.out.println(nf.format(123));//123.000
		  nf.setMaximumIntegerDigits(3);
		  System.out.println(nf.format(00345.5689));//345.5689
		  nf.setMinimumIntegerDigits(3);
		  System.out.println(nf.format(1.123456));//001.12346
		  
		  /**
		   * parsing  a float value
		   */
		  
		  double d1=123456.98745632;
		  NumberFormat nf1=NumberFormat.getCurrencyInstance();
		  String s=nf.format(d1);
		  System.out.println("Locale specific form:"+s);
//		  Number n	=	nf.format(s);
//		  System.out.println("java number format:"+n);
		  

	}

}
