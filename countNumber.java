package JavaProgramm;

public class countNumber {

	public static void main(String[] args) {
		
		int num = 64382635;
		int count = 0;
		while(num>0) {
			num = num/10;
			count++;
			
		}
		System.out.println("number of Digits:"+count);
		

	}

}
