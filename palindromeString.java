package JavaProgramm;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		// Defination : Palindrome String
		
		// A palindrome String is a String that remains the same when its chracters are reversed.
		            // Like : MADAM
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you string");
		String str = sc.next();
		String org_str= str;
		String rev = "  ";
		int len = str.length();
		for(int i = len-1; i>=0 ; i--) {
			
			rev = rev+str.charAt(i);
		}
		
		if (org_str.equals(rev)) {
			
			System.out.println(org_str+"is palindorme string");
			
		}
		else {
			
			System.out.println(org_str+"is not palindrome String");
		}
		
	}

}
