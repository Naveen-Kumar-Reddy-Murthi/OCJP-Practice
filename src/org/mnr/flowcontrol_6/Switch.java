package org.mnr.flowcontrol_6;

public class Switch {
	
	public static void main(String...args){
		
		/*
		 * Switch is used if there are multiple options
		 * We can use nested if but it reduces readability
		 */
		
		/*
		 * Allowed types in switch arguments:
		 * byte,short,char,int(till java4)
		 * Byte,Short,Character,Integer,enum(till java5)
		 * String(till java7)
		 * any executable statements must be between case and break. specifying anywhere else will result in compilation error
		 * Both case label and switch arguments can be expression but must be constant in result
		 * All the case lables must be within the range of switch argument datatype range
		 * Fall-through in Switch: if there is common piece of code to be executed for all the cases
		 * then we can define with caes with labels but without break
		 */
		
		byte x=10;//byte,short,char,int,Byte,Short,Character,Integer,enum,String are allowed as arguments to switch
		final int y=10;
		switch (x) 
		{//curly braces for swithc is mandatory
		//Even cases are optional. Empty switch block is valid
//				System.out.println();//CE:Syntax error on token "{", SwitchLabels expected after this token
			case 0:
					System.out.println("start");// case 0,50 are for fall-through strategy of switch
			case 65:
				System.out.println("naveen");	
				break;//break is optional, if not specified subsequent case also executed when this case is called
			case y:	//variables not allowed in case labels otherwise CE:case expressions must be constant expressions
					//if y is declared as final then it is allowed. This means only constants are allowed as case labels
//			case 2:
				System.out.println("reddy");
				break;
//			case y: //duplicate cases are not allowed CE:Duplicate case
//				System.out.println("reddy");
//				break;
			case 3:{//cases can be enclosed with curly braces.
					 System.out.println("murthi");
					 break;
				   }
//			case 5000:{// 5000 isn't in the range of byte hence CE:Type mismatch: cannot convert from int to byte
//				 System.out.println("murthi");
//				 break;
////			   }
			case 50:
				System.out.println("end");
		default:// default is also optional, if not specified then if switch argument is out of specified options, then no case is executed
				// default can be declared anywhere inside switch but it is recommanded to declare at the end for readability
			System.out.println("default");
			break;
		}
	}

}
