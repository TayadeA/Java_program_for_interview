package JavaProgramm;

import java.util.Scanner;

public class CountTheWordString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		/// Welcome to java
		int count = 1;
		for(int i =0 ; i<s.length()-1;i++) {
			
			if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
				
				count++;		
			}
		}
		System.out.println("Number of words in a string:"+ count);
}
	
}
