package JavaProgramm;

public class Swappingtwonumber {

	public static void main(String[] args) {
		int a = 10, b= 20;
		System.out.println("before swapping values are .."+a+"  "+b);
		
		//logic1 -Third variable
		
		int t = a;
		a=b;
		b=t;
		
		//logic 2 use + & - without using third variable
		a = a+b; // 10+20 =30
		b= a-b;  //30-20=10
		a= a+b;  //30-10 =20
		
		
		// logic 3- use * and / without using third variable
		// here a & b values should not be zero 
		
		a = a*b;  // 10*20 = 200
		b = a/b;  //200/20 = 10
		a = a/b;  //30-10 = 20
		
		
		//logic4 - bitwise XOR (^)
		//logic 5 - Single statement 
		//a= 10 b=20
		
		b= a+b-(a=b);
		
		System.out.println("after swapping values are .."+a+"  "+b);

	}

}
