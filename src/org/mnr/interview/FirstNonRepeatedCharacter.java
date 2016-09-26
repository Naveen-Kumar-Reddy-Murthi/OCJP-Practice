package org.mnr.interview;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String input="nnaavveez";
		//method1
				 int count=0;
				char c;
				
				for(int i=0;i<input.length();i++)
				{
					 c=input.charAt(i);
					 for(int j=0;j<input.length();j++)
					 {
						 if(c==input.charAt(j))
							 count++;
					 }
					 if(count==1){
						 System.out.println("First non-repeated character is:"+c);
						 break;
					 }
					 count=0;
				}
		 
		
		//method2
		
		/*for (char i : input.toCharArray()) {
			if (input.indexOf(i) == input.lastIndexOf(i)) {
				System.out.println(i);
				break;
			}
		}*/
	}

}
