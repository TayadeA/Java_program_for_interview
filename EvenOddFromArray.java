package JavaProgramm;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		int a []= {1,2,3,4,5,6,7,8,9};
		
		//Extracting even number .........
		
		System.out.println ("Even Number in array ..........");
		
		for (int i = 0 ; i<a.length;i++) {
			if (a[i]%2==0)
				System.out.println(a[i]);		
		}
		//EXtracting Odd Number .........
		
		System.out.println ("Odd Number in array ..........");
		
		for (int i = 0 ; i<a.length;i++) {
			if (a[i]%2!=0)
				System.out.println(a[i]);
			}

}
}
