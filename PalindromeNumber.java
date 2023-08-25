package JavaProgramm;
import java.util.Scanner;
public class PalindromeNumber {
	
	public static void main(String[] args) {
		// Defination : Palindrome Number 
		// A Palindrome number is a number that remains the Same when its digits are reversed like 16461
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int org_num = num ;
		int rev = 0;
		while(num!=0) {
			rev = rev*10 +num%10;
			num = num/10;
		}
		if (org_num==rev) {
			System.out.println(org_num+"palindrome number");
			
		}
		else {
			System.out.println(org_num+"not palindrome number");
			}		
		}
}


