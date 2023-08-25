package JavaProgramm;

import java.util.Arrays;

public class SortTwoARrayIntoThird {

	public static void main(String[] args) {
		int [] a = {1,2,3};//i
		int [] b = {2,4,6,8};//j
		
		int as = a.length;	//3
		int bs = b.length;	//4
		
		int [] c = new int [as+bs];//k
		int i = 0;
		int j = 0;
		int k = 0;
		// here , BY Applying the logic like comparing single element of first two array
		
		while (i<as && j<bs) {
			if (a[i]<=b[j]) {
				
				c[k] =a[i];
				i++;
				k++;	
			}
			else {
				c[k]=b[j];
				j++;
				k++;			
			}
			
		}
		while(i<as) {
			c[k]=a[i];
			i++;
			k++;
			
		}
		while(j<bs) {
			c[k]=b[j];
			j++;
			k++;
			
		}
		System.out.println(Arrays.toString(c));
	}
	
}
