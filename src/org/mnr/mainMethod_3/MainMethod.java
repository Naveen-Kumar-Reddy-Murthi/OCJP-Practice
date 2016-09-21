package org.mnr.mainMethod_3;

public class MainMethod {

//	public static void main(String[] args) {
//	static public  void main(String[] args) {	//valid
//	static public  void main(String[] naveen) {	//can change the name of array reference
//	static public  void main(String [] naveen) {	//valid
//	static public  void main(String []naveen) {	//valid
//	static public  void main(String naveen[]) {	//valid
//	static public  void main(String... naveen) {//valid
//	static public  void main(String ... naveen) {//valid
//	static public  void main(String ...naveen) {//valid
//	final static public  void main(String ... naveen) { //valid
//	static final strictfp public  void main(String ... naveen) { //valid
//	static final strictfp public  void main(String ... naveen) {
	
	/*
	 * static keyword is must for main method
	 * We can use followng keywords with main method. final,strictfp,synchronized
	 * 
	 */
	static final strictfp synchronized public  void main(String ... naveen) {
	System.out.println("Hello World222222!");

	}
	
	/*
	 * We can overload main method but jvm will only call the main method with string array as parameter
	 */
	
	static final strictfp synchronized public void main(int...naveen){
		System.out.println("Hello World33");
	}
	
	

}
