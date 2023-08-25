package JavaProgramm;

import java.util.Random;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {
		
		// Appraoch 1: Random 
	
		Random rand = new Random();
		
		int rand_int = rand.nextInt(1000);
		System.out.println(rand_int);
		
		
		double rand_dbl = rand.nextDouble();   // range 0.0 and less than 1.0
		System.out.println (rand_dbl);
		
		
		//Approach 2 : Math class
		
		System.out.println(Math.random());
				

	}

}

