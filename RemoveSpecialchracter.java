package JavaProgramm;

public class RemoveSpecialchracter {

	public static void main(String[] args) {
		
		// Question : Write a java program to remove all special characters from given string.
		// Input  : $ja!va$&st%ar
		// Output : javastar
		
		String str = "$ja!va$&st%ar";
		
		//Approach :1  ( replaceAll() method)
		
		String plainStr =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
		
		
	}
		//Approach : 2
	
	  /* String str1 = "Ab12%y", output = " "
	   
	   for (int i = 0 ; i<str1.length(); i++)
	   {
		   if(str1.charAt(i)>=65 && str1.charAt(i)<= 90 || str1.charAt(i)>= 97 && str1.charAt(i)<=122) {
			   
			   output = output + str1.charAt(i);
			   
		   }
	   }
	   
		System.out.println(output);
}*/

}

