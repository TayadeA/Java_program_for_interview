package JavaProgramm;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");		//6
		int num = sc.nextInt();
		sc.close();
		
		// logic for checking weather the given number is a perfect number or not
		int sum = 0;
		
		for(int i = 1; i<num ; i++) {
			if (num %i == 0) {
				
				sum = sum + i ;
				
			}
		}
		if (num == sum ) {
			System.out.println("Given Number is perfect number");
		}else {
			System.out.println("Given number is not a perfect number");
			
		}
		
		

	}

}
