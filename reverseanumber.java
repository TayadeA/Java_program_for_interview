package JavaProgramm;

import java.util.Scanner;

public class reverseanumber {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num =sc.nextInt();  // 1234
		
		// Approach 1: Using Algorithm
		
		int rev = 0;
		 while(num!= 0) {
			 
			 rev = rev*10 + num%10;  // How Actual debug the code :  0*10 + 1234%10 = 4  40+3 =43 , 430+2=432 , 4320+1 = 4321
		
			 							
			 num = num/10;	  //1234/10=123, 123/10=12, 12/10=1, 1/10= 0		
			 
		 }
		  System.out.println("Reverse Number is:" + rev);
		 
		}/*
}
	 	
	
		//Approach 2:  Using StringBuffer class
	
	    StringBuffer sb = new StringBuffer(String.valueOf(num));
	     
	     // Here, String.valueof() method will convert our num into string format and that string value stored into "sb"
	     
	     StringBuffer rev1 = sb.reverse();
	     
	     System.out.println("Reverse Number is:" + rev1);
}
}

		
		//Approach 3 : Using StringBuilder class
		 
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);    
		StringBuilder rev2 = sbl.reverse();
		System.out.println("Reverse Number is" + rev2);
		}

		
}*/

}


	