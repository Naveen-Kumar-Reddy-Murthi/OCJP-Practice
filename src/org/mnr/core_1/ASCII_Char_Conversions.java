package org.mnr.core_1;

public class ASCII_Char_Conversions {

	public static void main(String[] args) {
		System.out.println(getASCIIFromChar('A'));
		System.out.println(getASCIIFromChar('\\'));
		System.out.println(getCharFromASCII(97));
	}

	public static int getASCIIFromChar(char input){
		
		return (int)input;
	}
	
	public static char getCharFromASCII(int input){
		
		return (char)input;
	}
}
