package JavaProgramm;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,3,4,5,6,7,8,8,9,9,0,0};
		
		boolean Element2 = false;
		
		for(int i = 0;i< a.length;i++) {
			for (int j = i+1; j<a.length;j++) {
				if (a[i]==a[j]) 
				{
					System.out.println("Found Duplicate number in array :"+ a[i]);
				}
			}
			}
				if (Element2 = false) {
					System.out.println("Duplicate Number Not Found :");
					
				}
		}
	}


