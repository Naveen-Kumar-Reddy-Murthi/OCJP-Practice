package org.mnr.java5;

public class VarArgsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		sum(1,2);
//		sum(1,2,3,4,5);
//		sum(0);
//		sum(1,3,4,5,6,7,8,77,65,444,44,35,67776,222);
		
		//Above all are valid
		
		int a[]={1,1};
		int b[]={1,1};
		//sum(a,b);
		sum(new int[]{2,2},new int[]{2,2});

	}
	public static void sum(int...arr){//valid //it is a var-arg parameterised method. Internally it is dynamic 1-D array based on no of params passed
//	public static void sum(int  ...arr){ //valid// three dots are must
//	public static void sum(int...   arr){//valid
//	public static void sum(int  ...  arr){//valid
//	public static void sum(int arr...){//Invalid
//	public static void sum(int..arr){	//Invalid
//	public static void sum(int  ..  arr){//Invalid
//	public static void sum(int[]arr){//Invalid var-arg param can't be replaced with 1-D array
//	public static void sum(int y,int... arr){// valid var-arg params can be mixed with noraml params, but var-arg param should be last in the sequence.
//	public static void sum(double... y,int... arr){//invalid, we can only have one var-arg param in one method 
	
		int sum=0;
		for(int x:arr)
			sum=sum+x;
		System.out.println("sum="+sum);
	}
	
//	public static void sum(int[]arr){} //Illegal both var-arg and same 1-D param method can't exist together 
//	public static void sum(float[]arr){}// legal as array type is different than of above
	
	/*
	 * var-args method will get least priority i.e., If no other method is declared then only
	 * var-arg method is called
	 * In the following case sum call for two param method will call the below method
	 * not the var-arg method
	 */
	
	public static void sum (int x, int y){
		System.out.println(x+y);
	}

	/*
	 * If we pass group any same primitive type values that group become and 1d array of that primitive type
	 * i.e., here in var-arg sum method, arr is a 1-d array of integers
	 */
	
	
	/*
	 * if we pass group of same primitive type arrays, here x will become 2-d int array
	 */
	
	public static void sum(int[]...x){
		int sum=0;
		for(int[]i:x)
			for(int j:i)
			sum=sum+j;
		System.out.println("array's sum is="+sum);
	}
}
