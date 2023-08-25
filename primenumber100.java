package JavaProgramm;

public class primenumber100 {

	public static void main(String[] args) {
		
		int i , j , prime;
		 System.out.println(" prime number from 1 to 100");
		 
		 for ( i = 2;i<=100;i++) {
			 
			 prime = 0;
			  
			 for (j= 2 ; j<i; j++) {
				 
				 if (i%j==0) {
					 prime ++;
					 break;
					 
				 }
			 }
			 if (prime == 0) {
				 System.out.println(i);
			 }
		 }

	}

}
