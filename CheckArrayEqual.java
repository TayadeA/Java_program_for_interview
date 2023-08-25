package JavaProgramm;

import java.util.Arrays;

public class CheckArrayEqual {

	public static void main(String[] args) {
			
		int a1[] = {1,2,3,4,5,6,7};
		int a2[] = {1,2,3,4,5,6,7};
		
		// Approach 1 : By using equal method
		boolean status = Arrays.equals(a1, a2);
		
		if(status = true ) {
			
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not Equal");
			
		}
		//Approach 2 : By using Length of Array method
		
		boolean status1 = true;
		if (a1.length == a2.length) {
			for (int i = 0; i<=a1.length;i++) {
				if (a1[i]!=a2[i]) {
					status1 = false;
					
				}
			}
			
		}
		else {

			status1 = false ;
			
		}
		if (status1 = true) {
			System.out.println("Arrays are equal");
		}
		else {
			
			System.out.println("Arrays are not Equal");
		}
	}

}
