package JavaProgramm;

public class Reverse_String<reverse> {

	public static void main(String[] args) {
		//Question : Write the java program to reverse the string.
		// input  : "hello"
		// output : "olleh"
		
		// four Differnet way to reverse a String
		
		// 1. Using toCharArray() method
		// 2. Using chartAt(int index) method
		// 3. Using java.lang.StringBuffer class provided reverse() method
	
		String str = "akshay";
		
		//Approach 1 :
				
	     char[] chArr = str.toCharArray();
	     for(int i = chArr.length-1; i>=0;i-- ) {
	    	System.out.print(chArr[i]);
	    	
	     }
	        System.out.println("");
	     
	     //Approach 2:
	     for(int i = str.length()-1;i>=0; i--) {
	    	 System.out.print(str.charAt(i));
	    	 
	     }
	        System.out.println("");
	     //Approach 3 :
	     
	        StringBuffer sb = new StringBuffer(str);
	        System.out.println(sb.reverse());
		
	     }/*
		//Appraoch 
		String s =" ";
		String Str= " ";
	    reverse String(Str,s);

			public String reverse(String str , String s)
				{
					if(str.length()==0)
							return s;
					else{
						s=s+str.charAt(str.length()-1);
						return reverse(str.substring(0,str.length()-1),s);
					}
				}*/
		

 	     
}



