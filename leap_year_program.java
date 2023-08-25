package JavaProgramm;

import java.util.Scanner;

public class leap_year_program {

	public static void main(String[] args) {
		//considering any random year
		int year;
		
		//taking input from user using scanner class
	    //scn is object mode of scanner class
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter the year : ");
		year =scn.nextInt();
		//1st condition check-it is century leap year 
		//2nd condition check-it is leap year and not
		// century year 
		if ((year % 400 ==0)||((year%4==0) && (year % 100 != 0))) {
				
				//both conditions true -print leap year 
				System.out.println(year+":leap year");

		}
		    else 
			//any condition fails -print non leap year
			System.out.println(year+":Non-leap year");
	}
		
	}


