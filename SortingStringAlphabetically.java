package JavaProgramm;

import java.util.Arrays;

public class SortingStringAlphabetically {

	public static void main(String[] args) {
			String str = "java";
			char arr[] = str.toCharArray();
			
			// Approach 1 :  without using sort method 
			char temp ;
			for(int i = 0; i <arr.length; i++) 
													{
				for(int j= i+1; j <arr.length; j++) {
					if(arr[i]>arr[j]) {
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]= temp;
						
					}
				}
			}
			System.out.println(new String(arr));
			
			
			// Approach 2: using sort method
			
			String str1 = "programm";
			char[] charArray = str1.toCharArray();
			Arrays.sort(charArray);
			System.out.println(new String(charArray));
			
	}

}
