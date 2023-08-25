package JavaProgramm;

import java.util.Scanner;

public class LragestNumber {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter first number");
		 int a=sc.nextInt();
	
		 System.out.println("enter second Number");
		 int b = sc.nextInt();
		 
		 System.out.println("Enter Thrid Number");
		 int c= sc.nextInt();
		 
		 //Approach 1 : - Logic 
		 if(a>b && a>c) { 
			 System.out.println(a+"is largest number");
		 }
		 else if (b>a && b>c) {
			 System.out.println(b+"is largest number");
		 }
		 
		 else {
			 System.out.println(c+ " is largest number");
		 }
		 
		 //Approach 2:  Ternary operator in java
		  
		 int largest1  =  a>b?a:b ;    // largest of a & b
		 
		 int largest2 = c>largest1?c:largest1;      // largest of c & largest
		 
		 System.out.println(largest2+"is largest Number");
			 

	}

}
