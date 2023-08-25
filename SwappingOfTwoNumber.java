package JavaProgramm;

public class SwappingOfTwoNumber {

	public static void main(String[] args) {
		//  5 different way of Swappig two numbers
		
		int a = 10, b = 20 ;
		System.out.println("Before swapping values of .."+a+" "+b);
		
		// Approach : 1 (Using Third variable)
		int t = a;
		a=b;
		b=t;
		
		System.out.println("After swapping values of .."+a+" "+b);
		
		// Approach 2 : Use  + & - without using Third variable
		
		 a = a+b;  // 10+ 20 = 30
		 b=  a-b;  // 30-20 =  10
		 a=  a-b;  // 30-10 =  20
		 
		 System.out.println("After swapping values of .."+a+" "+b);
	
		// Approach 3 : Use * & / without using Third variable
		// here a & b should not be Zero.
		 
		 a = a*b;    // 10*20 = 200
		 b = a/b;    // 200/20 = 10
		 a = a/b;    // 200/10 = 20
		 
		 System.out.println("After swapping values of .."+a+" "+b);
		 
		 // Approach 4 : Bitwise XOR (^) operator 
		 
		 a= a^b;   // 10^20 = 30 
		 b= a^b;   // 30^20 = 10
		 a= a^b;   // 30^10=  20
		 
		  System.out.println("After swapping values of .."+a+" "+b);
		  
		  //Approach 5 : Using the Single Statement 
		  // current value is a = 10 & b= 20
		  
		  b= a+b-(a=b);
		  
		  System.out.println("After swapping values of .."+a+" "+b);
		  

	}

}
