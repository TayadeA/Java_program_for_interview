
package JavaProgramm;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //system.in = this will accpet user value at runtime
		System.out.println("enter a number ");
		int  num = sc.nextInt();  //1234
		
		//logic 1 -using algorithm
		/*int rev = 0;
		while (num  !=0) {
			rev= rev*10 + num%10;
			num = num/10;
			
		}*/
		
		//using StringBuffer class
		StringBuffer rev ;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 = sb.reverse();
		
		
		
		
		System.out.println("reverse number is :"+rev1);
		
		

	}

}
