package org.mnr.core_1;

public class Unicode_char_Conversions {

	public static void main(String[] args) {
		System.out.println(getUnicodeFromChar('A'));
		System.out.println(getCharFromUnicode('\u0041'));
	}
	public static String getUnicodeFromChar(char input){
		
		return "\\u"+Integer.toHexString(input | 0x10000);
	//	return  String.format("\\u%04x", (int) input);
	}
	
	public static char getCharFromUnicode(char input){
		return (char)input;
	}
}
