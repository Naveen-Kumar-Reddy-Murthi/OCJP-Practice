package org.mnr.internationalization_27;

import java.util.Arrays;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		/**
		 * process of designing apps in such a way that they can support
		 * various langauges and countries 
		 * Internationalization conecpt can be implemented by using
		 * the following three classes
		 * 1. Locale
		 * 2. NumberFormat
		 * 3. DateFormat
		 */
		
		LocaleDemo();

	}
	
	public static void LocaleDemo(){
		/**
		 * It represents a geopraphical region or  language
		 */
		
		Locale locale	=	Locale.US;
		locale=Locale.getDefault();
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getISO3Country());
		System.out.println(Arrays.toString(locale.getISOCountries()));
	}

}
