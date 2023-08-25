package JavaProgramm;

public class SumOfDigitsNumber {

	public static void main(String[] args) {
			
		int num = 12343;
		int sum = 0;
		while(sum >0) {
			sum = sum + num%10; //4
			num = num/10;
			
			
		}
			System.out.println("sum of digits in a number:" +sum);
	}

}
