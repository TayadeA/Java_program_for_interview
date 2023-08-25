package JavaProgramm;

public class MaxMinElementInArray {

	public static void main(String[] args) {

		int a []= {50,30,40,20,60};
		int max = a[0];   //50
		
		for (int i = 1; i<a.length;i++) {
			if (a[i]>max) 	//30>50
			
			{
				
				max = a[i];			// 50
			}	
		}
		System.out.println("Maximum Element is array is :" +max);
		
		int min = a[0];
		for (int i = 1 ; i < a.length;i++) {
			if (a[i]<min) 
			{
				min = a[i];
				
			}
		}
		System.out.println("Minimum Element is array is :" +min);
	}

}
